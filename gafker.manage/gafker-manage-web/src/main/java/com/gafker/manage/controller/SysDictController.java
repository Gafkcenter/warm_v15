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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.pojo.SysDict;
import com.gafker.manage.pojo.SysDictType;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.query.SysDictQuery;
import com.gafker.manage.service.SysDictService;
import com.gafker.manage.service.SysDictTypeService;

/**
 * 字典，类型操作
 * 
 * @author gafker
 *
 */
@RequestMapping("admin/dict")
@Controller
public class SysDictController implements BaseController<SysDict, Page, SysDictQuery, String> {
	public static Logger logger1 = LogManager.getLogger(HappayteachersdaysController.class);

	@Autowired
	private SysDictService sysDictService;
	@Autowired
	private SysDictTypeService sysDictTypeService;

	/**
	 * 跳转到添加字典表单
	 */
	@RequestMapping(value = "s", method = RequestMethod.GET)
	@Override
	public String save(Model m) throws Exception {
		List<SysDictType> ma = sysDictTypeService.listAll();
		String value = "value";
		m.addAttribute("exchange", value);
		m.addAttribute("types", ma);
		m.addAttribute("dict", new SysDict());
		m.addAttribute("dicttype", new SysDictType());
		return "admin/dict/dictform";
	}

	/**
	 * 保存字典信息
	 */
	@RequestMapping(value = "s", method = RequestMethod.POST)
	@Override
	public String save(@Valid SysDict record, Model m, BindingResult b) throws Exception {
		SysDictQuery c = new SysDictQuery();
		c.setType(record.getType());
		List<SysDict> onetypeValues = sysDictService.listByCondition(c);
		if (!(null == onetypeValues)) {
			for (SysDict type : onetypeValues) {
				if (type.getLabelCn().equals(record.getLabelCn()) || type.getValue().equals(record.getValue())) {
					logger1.info(type.getLabelCn() + ":" + record.getLabelCn());
					logger1.info(type.getValue() + ":" + record.getValue());
					List<SysDictType> ma = sysDictTypeService.listAll();
					m.addAttribute("exchange", "value");
					m.addAttribute("types", ma);
					m.addAttribute("dicttype", new SysDictType());
					m.addAttribute("message", "已经存在的类型值！");
					m.addAttribute("dict", record);
					return "admin/dict/dictform";
				}
			}
		}
		record.setCreateDate(new Date());
		record.setCreateBy("1");
		record.setUpdateDate(new Date());
		record.setType(sysDictTypeService.getDictName(record.getType()));
		int save = sysDictService.save(record);
		if (save > 0) {
			m.addAttribute("message", "成功添加类型值！");
		} else {
			m.addAttribute("message", "类型值添加失败！");
		}
		return "redirect:/admin/dict/l";
	}

	@Override
	public String saveSelective(SysDict record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<SysDict> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Long id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 跳转到字典编辑表单
	 */
	@RequestMapping(value = "u/{id}", method = RequestMethod.GET)
	@Override
	public String update(@PathVariable Integer id, Model m) throws Exception {
		SysDict dict = sysDictService.selectByPrimaryKey(id);
		dict.setType(sysDictTypeService.getDictId(dict.getType()));
		List<SysDictType> ma = sysDictTypeService.listAll();
		String value = "value";
		m.addAttribute("exchange", value);
		m.addAttribute("types", ma);
		m.addAttribute("dicttype", new SysDictType());
		m.addAttribute("dict", dict);
		return "admin/dict/editform";
	}

	/**
	 * 更改字典信息
	 */
	@RequestMapping(value = "u", method = RequestMethod.POST)
	@Override
	public String updateByPrimaryKey(@Valid SysDict record, Model m, BindingResult b) throws Exception {
		record.setType(sysDictTypeService.getDictName(record.getType()));
		sysDictService.updateByPrimaryKey(record);
		return "redirect:/admin/dict/l";
	}

	/**
	 * 更新字典信息delFlag状态
	 */
	@RequestMapping(value = "d/{id}/{delFlag}", method = RequestMethod.GET)
	public String updateSelectiveAjax(SysDict record, Model m, BindingResult b, @PathVariable String id,
			@PathVariable Integer delFlag) throws Exception {
		record.setId(Integer.valueOf(id));
		record.setDelFlag(delFlag > 0 ? "0" : "1");
		record.setUpdateBy("1");
		record.setUpdateDate(new Date());
		int update = sysDictService.updateSelective(record);
		if (logger1.isDebugEnabled()) {
			logger1.debug("更新字典信息delFlag状态" + update + "条被更新！delFlag的更新前状态" + delFlag + " 更新后状态" + record.getDelFlag());
		}
		return "success";
	}

	/**
	 * 更新字典信息delFlag状态
	 */
	@RequestMapping(value = "d/{id}/{delFlag}", method = RequestMethod.POST)
	@Override
	public String updateSelective(SysDict record, Model m, BindingResult b, @PathVariable String id,
			@PathVariable Integer delFlag) throws Exception {
		record.setId(Integer.valueOf(id));
		record.setDelFlag(delFlag > 0 ? "0" : "1");
		record.setUpdateBy("1");
		record.setUpdateDate(new Date());
		int update = sysDictService.updateSelective(record);
		if (logger1.isDebugEnabled()) {
			logger1.debug("更新字典信息delFlag状态" + update + "条被更新！delFlag的更新前状态" + delFlag + " 更新后状态" + record.getDelFlag());
		}
		return "redirect:/admin/dict/l";
	}

	@Override
	public String updateByCondition(SysDict record, SysDictQuery con, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<SysDict> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "l", method = RequestMethod.GET)
	@Override
	public String listAll(Model m) throws Exception {
		List<SysDict> listAllDict = sysDictService.listAll();
		m.addAttribute("dictlist", listAllDict);
		return "admin/dict/listdict";
	}

	@Override
	public String deleteByPrimaryKey(SysDict record, Model m) throws Exception {
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
	public String countBySelfCondition(SysDict record) throws Exception {
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

	@RequestMapping(value = "q", method = RequestMethod.POST)
	@Override
	public String listByCondition(SysDictQuery c, Model m) throws Exception {
		List<SysDict> dictlist = sysDictService.listByCondition(c);
		m.addAttribute("dictlist", dictlist);
		return "admin/dict/listdict";
	}

	@Override
	public String save(SysDict record, BindingResult b, Model m, HttpServletRequest request,
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
