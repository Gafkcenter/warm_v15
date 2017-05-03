package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.common.utils.HttpClientUtil;
import com.gafker.common.utils.vcf.AddressBean;
import com.gafker.common.utils.vcf.ImportExportVcf;
import com.gafker.manage.mapper.PhonesevenMapper;
import com.gafker.manage.pojo.FamilysizeExample;
import com.gafker.manage.pojo.PhoneprefixExample;
import com.gafker.manage.pojo.Phoneseven;
import com.gafker.manage.pojo.PhonesevenExample;
import com.gafker.manage.pojo.PhonesevenExample.Criteria;
import com.gafker.manage.pojo.enums.PhoneprefixFinished;
import com.gafker.manage.pojo.form.PhonecvfpathForm;
import com.gafker.manage.pojo.form.PhoneprefixForm;
import com.gafker.manage.pojo.form.PhonesevenForm;
import com.gafker.manage.pojo.jsonbeantype.AddressBeanExchange;
import com.gafker.manage.pojo.jsonbeantype.Data360;
import com.gafker.manage.pojo.jsonbeantype.PhoneMobile;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.PhonecvfpathService;
import com.gafker.manage.service.PhoneprefixService;
import com.gafker.manage.service.PhonesevenService;
import com.gafker.manage.service.utils.FileUtils;
import com.gafker.manage.service.utils.JSonUtils;

@Service
@Transactional
public class PhonesevenServiceImpl implements PhonesevenService {
	private static final Logger LOGGER = LogManager.getLogger(PhonesevenServiceImpl.class);

	@Value("${vcf.file.path.root}")
	private String vcfPathRoot;
	@Value("${vcf.file.record.root}")
	private String vcfRecordRoot;
	@Value("${api.mobile.iteblog}")
	private String mobileRest;
	@Value("${api.mobile.shouji}")
	private String mobileRest1;
	@Value("${api.mobile.taobao}")
	private String mobileRest2;
	@Value("${page.getbatch.limit}")
	private int getLimit;

	@Autowired
	PhonesevenMapper phonesevenMapper;

	@Autowired
	PhoneprefixService phoneprefixService;
	
	@Autowired
	PhonecvfpathService phonecvfpathService;

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
	public List<PhonesevenForm> selectByExample(FamilysizeExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonesevenForm> selectByExample(FamilysizeExample c, Page p) throws Exception {
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
		List<PhonesevenForm> insertList = new ArrayList<PhonesevenForm>();
		// 暂用Remarks用来存放上次seven执行的结束位置,即从seven开始执行。
		String startPositionPhone = data.getRemarks();
		long i = Long.parseLong(data.getPrefix()) * 10000;
		long endLoop = i + 9999;
		if (startPositionPhone != null && !"".equals(startPositionPhone)) {
			i = Long.parseLong(startPositionPhone);
		}
		for (; i <= endLoop; i++) {
			PhonesevenForm r = new PhonesevenForm();
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
	public void updateAttributionPhoneSeven(Long seven, List<PhonesevenForm> phoneList) {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateAttributionPhoneSeven(Long seven, PhonesevenForm phoneLis) throws Exception {
		int result = -1;
		PhonesevenExample c = new PhonesevenExample();
		Criteria cr = c.createCriteria();
		cr.andFinishedIsNull();
		if (getLimit != -1) {
			c.setStart(0);
			c.setLimit(getLimit);
		}
		List<Phoneseven> dataList = phonesevenMapper.selectByExample(c);
		if (dataList == null) {
			return result;
		}
		for (Phoneseven phone : dataList) {
			result = getGeoInfo(phone);
		}
		if (result == 0)
			result = 0;
		return result;
	}

	private int getGeoInfo(Phoneseven phone) {
		int result = 0;
		PhonesevenForm phoneNew = new PhonesevenForm();
		phoneNew.getFromPhoneseven(phone);
		// httpclient 对phoneseven 设置归属地
		String phoneseven = String.valueOf(phoneNew.getPhoneseven());
		String mobleRestTemp = mobileRest1;
		mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
		String stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp);
		PhoneMobile phoneTemp = JSonUtils.toObject(stringGeo, PhoneMobile.class);
		Data360 data2 = phoneTemp.getData();
		if (phoneTemp != null && data2 != null && "".equals(data2.getProvince())) {
			mobleRestTemp = mobileRest2;
			mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
			stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp + "8888");
			if (stringGeo.contains("province:''")) {
				mobleRestTemp = mobileRest;
				mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
				stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp);
				if (stringGeo.contains("<html>"))
					return result;
			}
		}
		stringGeo = stringGeo.replaceAll("ID", "id");
		PhoneMobile phoneInfo = JSonUtils.toObject(stringGeo, PhoneMobile.class);
		if (phoneInfo != null && ("0".equals(phoneInfo.getRet()) || "0".equals(phoneInfo.getCode()))) {
			phoneNew.setFinished(PhoneprefixFinished.START.getValue());
			String phoneString = JSonUtils.toJsonString(phoneInfo);
			Data360 data = phoneInfo.getData();
			phoneNew.setRemarks(phoneInfo.getAreaCode() + "_" + phoneInfo.getZip() + "_" + phoneInfo.getAreaVid() + "_"
					+ phoneInfo.getMts());
			if (data != null && !"".equals(data.getProvince()))
				phoneNew.setRemarks(phoneInfo.getData().getProvince() + phoneInfo.getData().getCity());
			phoneNew.setGeoposition(phoneString);
			phoneNew.setUpdatetime(new Date());
		}
		if ("null_null_null_null".equals(phoneNew.getRemarks()))
			phoneNew.setFinished(null);
		result = phonesevenMapper.updateByPrimaryKey(phoneNew);
		return result;
	}

	@Override
	public int saveVcfPhoneSeven(String cityAlpha, List<PhonesevenForm> phoneList) throws Exception {
		// TODO Auto-generated method stub
		// 1.查出所有的PhoneSeven starPosition IS NULL 可以分页page
		int result = -1;
		PhonesevenExample c = new PhonesevenExample();
		Criteria cr = c.createCriteria();
		cr.andStartpositionIsNull();
		if (getLimit != -1) {
			c.setStart(0);
			c.setLimit(getLimit);
		}
		List<Phoneseven> dataList = phonesevenMapper.selectByExample(c);
		if (dataList == null) {
			return result;
		}
		// add. 每个phoneseven生成一个vcf号码系列
		List<AddressBean> addressList = new ArrayList<AddressBean>();
		int fileTotal=0;
		for (Phoneseven data : dataList) {
			// 生成AddressBean列表
			StringBuffer sb=new StringBuffer();
			long m = data.getPhoneseven() * 10000;
			int fileCount = 1;
			String yearMonthPath = FileUtils.getYearMonthDayPath(true);
			String remarks = data.getRemarks();
			for (long i = 1; i < 10000; i++) {
				data.setPhoneseven(m + i);
				data.setRemarks( remarks+ data.getPhoneseven());
				AddressBeanExchange ad = new AddressBeanExchange();
				ad.fromPhonesevenToAddressBean(data);
				addressList.add(ad);
				if (i % 5 == 0) {
					// 2.以5000为单位保存到vcf文件中
					this.writeToVcfFile(addressList, data, fileCount, yearMonthPath,sb);
					addressList = new ArrayList<AddressBean>();
					fileCount++;
				}
			}
			if (addressList != null && addressList.size() > 0)
				this.writeToVcfFile(addressList, data, fileCount, yearMonthPath,sb);
			fileTotal+=fileCount;
			// 3.更新phoneSeven的startPonsition
			this.updatePhoneSevenStartPosition(data);
			// 4.向表phonecvfpath插入一条记录
			PhonecvfpathForm s = new PhonecvfpathForm();
			s.setPhonesevenFk(data.getId());
			s.setCvfname(sb.toString());
			s.setCreatetime(new Date());
			phonecvfpathService.save(s);
		}
		return fileTotal;
	}

	private void updatePhoneSevenStartPosition(Phoneseven data) {
		Phoneseven phoneSeven=new Phoneseven();
		phoneSeven.setId(data.getId());
		phoneSeven.setStartposition(data.getStartposition());
		phoneSeven.setUpdatetime(new Date());
		phonesevenMapper.updateByPrimaryKeySelective(phoneSeven);
	}

	private void writeToVcfFile(List<AddressBean> addressList, Phoneseven data, int fileCount, String yearMonthPath,StringBuffer sb) {
		String commonPathName = yearMonthPath + data.getRemarks() +"_"+ fileCount + ".vcf";
		String saveFileName = vcfPathRoot + commonPathName;
		String recordFileName = vcfRecordRoot + commonPathName;
		ImportExportVcf.exportVcf(saveFileName, addressList);
		sb.append(recordFileName+",");
	}

//	private List<AddressBean> convertPhonesevenToAddressBeanList(List<Phoneseven> dataList) {
//		List<AddressBean> dl = null;
//		if (dataList != null && dataList.size() > 0) {
//			dl = new ArrayList<AddressBean>();
//			for (Phoneseven data : dataList) {
//				AddressBeanExchange ae = new AddressBeanExchange();
//				ae.fromPhonesevenToAddressBean(data);
//				dl.add(ae);
//			}
//		}
//		return dl;
//	}

	@Override
	public int save(List<PhonesevenForm> sList) throws Exception {
		int result = phonesevenMapper.insertBatch(sList);
		return result;
	}

}
