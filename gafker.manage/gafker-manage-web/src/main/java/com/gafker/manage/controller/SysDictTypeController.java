package com.gafker.manage.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.pojo.SysDict;
import com.gafker.manage.pojo.SysDictType;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.query.SysDictQuery;
import com.gafker.manage.service.SysDictTypeService;



/**
 * 字典，类型操作
 * 
 * @author gafker
 *
 */
@RequestMapping("admin/dicttype")
@Controller
public class SysDictTypeController implements BaseController<SysDictType, Page, SysDictQuery, String> {
	public static Logger logger1 = LogManager.getLogger(HappayteachersdaysController.class);
	@Autowired
	private SysDictTypeService sysDictTypeService;
	/**
	 * 跳转到添加字典类型表单
	 */
	@RequestMapping(value = "s", method = RequestMethod.GET)
	@Override
	public String save(Model m) throws Exception {
		List<SysDictType> ma=sysDictTypeService.listAll();
		String value="type";
		m.addAttribute("exchange",value );
		m.addAttribute("types", ma);
		m.addAttribute("dict", new SysDict());
		m.addAttribute("dicttype", new SysDictType());
		return "admin/dict/dictform";
	}

	/**
	 * 保存字典类型信息
	 */
	@RequestMapping(value = "s", method = RequestMethod.POST)
	@Override
	public String save(@Valid @ModelAttribute SysDictType record, Model m, BindingResult b) throws Exception {
		String value="value";
		SysDictQuery c = new SysDictQuery();
		c.setType(record.getNamecn());
		Boolean existType = this.isExistType(record.getNamecn(),c );
		if(existType){
			m.addAttribute("message", "该类型已经存在！");
			return "redirect:/admin/dicttype/s";
		}
		if (b.hasErrors()) {
			FieldError fieldError = b.getFieldError();
			logger1.info("Code:" + fieldError.getCode() + ", object:" + fieldError.getObjectName() + ", field:"
					+ fieldError.getField());
			return "admin/dict/dictform";
		}
		record.setCreatetime(new Date());
		record.setUpdatetime(new Date());
		int save = sysDictTypeService.save(record);
		if (save > 0) {
			SysDict sysDict = new SysDict();
			sysDict.setId(record.getId().intValue());
			m.addAttribute("dict",sysDict );
			m.addAttribute("message", "添加类型成功!");
		} else {
			value="type";
			m.addAttribute("message", "添加类型失败!");
			m.addAttribute("exchange",value );
			return "redirect:/admin/dicttype/s";
		}
		m.addAttribute("exchange",value );
		return "redirect:/admin/dict/s";
	}

	@Override
	public String saveSelective(SysDictType record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<SysDictType> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Long id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Integer id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByPrimaryKey(SysDictType record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(SysDictType record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(SysDictType record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(SysDictType record, SysDictQuery con, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<SysDictType> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listAll(Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByCondition(SysDictQuery c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, SysDictQuery cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, SysDictQuery cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(SysDictType record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(SysDictQuery con, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBatch(List<? extends Number> ids, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String count() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countByCondition(SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "{type}",method=RequestMethod.GET)
	public Boolean isExistType(@PathVariable String type, SysDictQuery c) throws Exception {
		//不存在
		boolean contains=false;
		if(type.matches("\\w+")){
			List<SysDictType> typeList = sysDictTypeService.listByCondition(c);
			for(SysDictType d:typeList){
				if(d.getNamecn().equals(c.getType())){
					//存在
					contains=true;
					break;
				}
			}
		}
		return contains;
	}

	@Override
	public String save(SysDictType record, BindingResult b, Model m, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByTwoConditon(Long userId, Long productId, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByOneConditon(Long productId, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
