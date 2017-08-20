package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.common.utils.vcf.AddressBean;
import com.gafker.common.utils.vcf.ImportExportVcf;
import com.gafker.manage.datatype.AddressBeanExchange;
import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.PhoneprefixExample;
import com.gafker.manage.entity.Phoneseven;
import com.gafker.manage.entity.PhonesevenExample;
import com.gafker.manage.entity.PhonesevenExample.Criteria;
import com.gafker.manage.enums.PhoneprefixFinished;
import com.gafker.manage.mapper.PhonesevenMapper;
import com.gafker.manage.pojo.PhonecvfpathForm;
import com.gafker.manage.pojo.PhoneprefixForm;
import com.gafker.manage.pojo.PhonesevenForm;
import com.gafker.manage.service.PhonecvfpathService;
import com.gafker.manage.service.PhoneprefixService;
import com.gafker.manage.service.PhonesevenService;
import com.gafker.manage.service.utils.FileUtils;
import com.gafker.manage.service.utils.ThirdPartyRestApi;
import com.gafker.manage.serviceImpl.multithread.MultiThreadProcessService;

@Service
@Transactional(propagation=Propagation.SUPPORTS)//by Defonds,for BUG094537
public class PhonesevenServiceImpl implements PhonesevenService {
	private static final Logger LOGGER = LogManager.getLogger(PhonesevenServiceImpl.class);

	@Value("${vcf.file.path.root}")
	private String vcfPathRoot;
	@Value("${vcf.file.record.root}")
	private String vcfRecordRoot;
	@Value("${api.mobile.shouji}")
	private String mobileRest1;
	@Value("${api.mobile.taobao}")
	private String mobileRest2;
	@Value("${api.mobile.iteblog}")
	private String mobileRest3;
	@Value("${api.mobile.ipcn}")
	private String mobileRest4;
	@Value("${api.getphoneplace.limit}")
	private int getPhoneplaceLimit;
	@Value("${vcf.getseven.limit}")
	private int getVcfSevenLimit;
	@Value("${vcf.can.save.limit}")
	private int vcfByCanSaveCount;

	@Autowired
	PhonesevenMapper phonesevenMapper;

	@Autowired
	PhoneprefixService phoneprefixService;

	@Autowired
	PhonecvfpathService phonecvfpathService;
	
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private MultiThreadProcessService multithreadProcessService;

	@Override
	public int save(PhonesevenForm s) throws Exception {
		s.setUpdatetime(new Date());
		int result = phonesevenMapper.insertSelective(s);
		return result;
	}

	@Override
	public int update(PhonesevenForm s) throws Exception {
		s.setUpdatetime(new Date());
		int result = phonesevenMapper.updateByPrimaryKey(s);
		return result;
	}

	@Override
	public int updateSelect(PhonesevenForm s) throws Exception {
		s.setUpdatetime(new Date());
		int result = phonesevenMapper.updateByPrimaryKeySelective(s);
		return result;
	}

	@Override
	public int delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhonesevenForm findByPrimaryId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonesevenForm> selectByExampleForm(PhonesevenExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonesevenForm> selectByExample(PhonesevenExample c) throws Exception {
		List<Phoneseven> dataList = phonesevenMapper.selectByExample(c);
		List<PhonesevenForm> dataVo = this.copyEntityToVoForm(dataList);
		return dataVo;
	}

	@Override
	public int generateAndCheckPhoneSeven() throws Exception {
		int result = 0;
		// 1.查phoneprefix Status=open &&Finished is NULL进行phoneseven 号码插入操作
		List<PhoneprefixForm> dataList = phoneprefixService.selectByExample(new PhoneprefixExample());
		if (dataList != null && dataList.size() > 0) {
			int subresult = 0;
			for (PhoneprefixForm data : dataList) {
				// 判断是否存在该prefix的记录存在就不插入
				PhonesevenExample c = new PhonesevenExample();
				Criteria cr = c.createCriteria();
				cr.andPrefixFkEqualTo(data.getId());
				long countExist = phonesevenMapper.countByExample(c);
				if (countExist > 0) {
					// phoneseven已经存在的跳过
					continue;
				}
				// 批量插入单个prefix到Seven表
				subresult = addSevenBatch(data);
			}
			result += subresult;
		}
		LOGGER.info("共生成：" + result + "条新seven记录！");
		return result;
	}

	/**
	 * 批量插入单线程(根据Prefix查询生成Phoneseven)
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	private int addSevenBatch(PhoneprefixForm data) throws Exception {
		int result;
		List<Phoneseven> insertList = new ArrayList<Phoneseven>();
		// 暂用Remarks用来存放上次seven执行的结束位置,即从seven开始执行。
		String startPositionPhone = data.getRemarks();
		long i = Long.parseLong(data.getPrefix()) * 10000;
		long endLoop = i + 9999;
		if (startPositionPhone != null && !"".equals(startPositionPhone)) {
			i = Long.parseLong(startPositionPhone);
		}
		for (; i <= endLoop; i++) {
			Phoneseven r = new Phoneseven();
			r.setPhoneseven(i);
			r.setUpdatetime(new Date());
			r.setPrefixFk(data.getId());
			insertList.add(r);
		}
		result = phonesevenMapper.insertBatch(insertList);
		data.setFinished(PhoneprefixFinished.FINISHED.getValue());
		// 对完成的seven 设置phoneprefix的完成状态为finished为close.
		int closeResult = phoneprefixService.updateSelect(data);
		LOGGER.info("phoneprefix:" + data.getPrefix() + " 完成phoneseven数据插入!状态关闭成功：" + closeResult);
		return result;
	}

	@Override
	public void updateGeoPhoneSeven(Long seven, List<PhonesevenForm> phoneList) throws Exception {
		int result  = this.updateGeoResultToRepostory(phoneList);
	}

	@Override
	public int updateGeoPhoneSeven(Long seven, PhonesevenForm phoneLis) throws Exception {
		PhonesevenExample c = getGeoCondition();
		c.createCriteria().andFinishedIsNull();
		c.setStart(1);
		c.setLimit(100);
		long start =System.currentTimeMillis();
		List<PhonesevenForm> dataList = this.selectByExample(c);
		int result  = this.updateGeoResultToRepostory(dataList);
		LOGGER.info("总记录数："+dataList.size()+"\t	有效更新数量:"+result+"\t	所用时间:"+(System.currentTimeMillis()-start)/60/1000+"分钟");
		return result;
	}

	private int updateGeoResultToRepostory(List<PhonesevenForm> dataList) throws Exception {
		int result=-1;
		int change =0;
		if (dataList == null) {
			return result;
		}
		for (PhonesevenForm phone : dataList) {
			try{
			PhonesevenForm  geoInfo=new PhonesevenForm();
			geoInfo = ThirdPartyRestApi.getPhonePlaceFromAll3rdApi(phone,mobileRest4,mobileRest1,mobileRest2,mobileRest3);
			
			if (geoInfo != null && geoInfo.getGeoposition()!=null){
				result = this.update(geoInfo);
				if(result>0)
				change++;
			}else{
				geoInfo.setId(phone.getId());
				geoInfo.setFinished("nodata");
				result =this.update(geoInfo);
			}
			}catch(Exception e){
				continue;
			}
		}
		return change;
	}

	public PhonesevenExample getGeoCondition() {
		PhonesevenExample c = new PhonesevenExample();
		Criteria cr = c.createCriteria();
		cr.andFinishedIsNull();
		if (getPhoneplaceLimit != -1) {
			c.setStart(0);
			c.setLimit(getPhoneplaceLimit);
		}
		return c;
	}

	@Override
	public int saveVcfPhoneSeven(String cityAlpha, List<PhonesevenForm> phoneList) throws Exception {
		// 1.查出所有的PhoneSeven starPosition IS NULL 可以分页page
		int result = -1;
		PhonesevenExample c = new PhonesevenExample();
		Criteria cr = c.createCriteria();
		cr.andStartpositionIsNull();
		if (getVcfSevenLimit != -1) {
			c.setStart(0);
			c.setLimit(getVcfSevenLimit);
		}
		List<PhonesevenForm> dataList = this.selectByExample(c);
		if (dataList == null) {
			return result;
		}
		// add. 每个phoneseven生成一个vcf号码系列
		List<AddressBean> addressList = new ArrayList<AddressBean>();
		int fileTotal = 0;
		for (Phoneseven data : dataList) {
			// 生成AddressBean列表
			StringBuffer sb = new StringBuffer();
			long m = data.getPhoneseven() * 10000;
			int fileCount = 1;
			String yearMonthPath = FileUtils.getYearMonthDayPath(true);
			String remarks = data.getRemarks();
			for (long i = 0; i < 10000; i++) {
				data.setPhoneseven(m + i);
				data.setRemarks(remarks + data.getPhoneseven());
				AddressBeanExchange ad = new AddressBeanExchange();
				ad.fromPhonesevenToAddressBean(data);
				addressList.add(ad);
				if (i % vcfByCanSaveCount == 0) {
					// 2.以5000为单位保存到vcf文件中
					this.writeToVcfFile(addressList, data, fileCount, yearMonthPath, sb);
					addressList = new ArrayList<AddressBean>();
					fileCount++;
				}
			}
			if (addressList != null && addressList.size() > 0)
				this.writeToVcfFile(addressList, data, fileCount, yearMonthPath, sb);
			fileTotal += fileCount;
			// 3.更新phoneSeven的startPonsition
			this.updatePhoneSevenStartPosition(data);
			// 4.向表phonecvfpath插入一条记录
			this.insertCvfPath(data, sb);
		}
		return fileTotal;
	}

	private void insertCvfPath(Phoneseven data, StringBuffer sb) throws Exception {
		PhonecvfpathForm s = new PhonecvfpathForm();
		s.setPhonesevenFk(data.getId());
		s.setCvfname(sb.toString());
		s.setCreatetime(new Date());
		int save = phonecvfpathService.save(s);
		if (save <= 0 && LOGGER.isDebugEnabled()) {
			LOGGER.debug("文件保存的记录没有保存成功,注意确认:" + data.getId());
		}
	}

	private void updatePhoneSevenStartPosition(Phoneseven data) throws Exception {
		PhonesevenForm phoneSeven = new PhonesevenForm();
		phoneSeven.setId(data.getId());
		phoneSeven.setStartposition(String.valueOf(data.getPhoneseven()));
		phoneSeven.setUpdatetime(new Date());
		int update = this.updateSelect(phoneSeven);
		if (update <= 0 && LOGGER.isDebugEnabled()) {
			LOGGER.debug("文件保存的记录没有保存成功,注意确认:" + data.getId());
		}
	}

	private void writeToVcfFile(List<AddressBean> addressList, Phoneseven data, int fileCount, String yearMonthPath,
			StringBuffer sb) {
		String commonPathName = yearMonthPath + data.getRemarks() + "_" + fileCount + ".vcf";
		String saveFileName = vcfPathRoot + commonPathName;
		String recordFileName = vcfRecordRoot + commonPathName;
		ImportExportVcf.exportVcf(saveFileName, addressList);
		sb.append(recordFileName + ",");
	}

	@Override
	public PhonesevenForm copyEntityToVoForm(Phoneseven entity) throws Exception {
		PhonesevenForm dest = null;
		if (entity != null) {
			dest = new PhonesevenForm();
			BeanUtils.copyProperties(dest, entity);
		}
		return dest;
	}

	@Override
	public List<PhonesevenForm> copyEntityToVoForm(List<Phoneseven> entity) throws Exception {
		List<PhonesevenForm> desc = null;
		if (!CollectionUtils.isEmpty(entity)) {
			desc = new ArrayList<PhonesevenForm>();
			for (Phoneseven en : entity)
				desc.add(this.copyEntityToVoForm(en));
		}
		return desc;
	}

	@Override
	public int save(List<PhonesevenForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PhonesevenForm> selectByExample(PhonesevenExample c, Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonesevenForm> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonesevenForm> selectAll(Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateGeoPhoneSeven(int pageSize, int pageNo) throws Exception {
		PhonesevenExample c = getGeoCondition();
		c.createCriteria().andFinishedIsNull();
		c.setStart((pageNo-1)*pageSize);
		c.setLimit(pageSize);
		long start =System.currentTimeMillis();
		List<PhonesevenForm> dataList = this.selectByExample(c);
		int result  = this.updateGeoResultToRepostory(dataList);
		LOGGER.info("总记录数："+dataList.size()+"\t	有效更新数量:"+result+"\t	所用时间:"+(System.currentTimeMillis()-start)/60/1000+"分钟");
		return result;
	}
}
