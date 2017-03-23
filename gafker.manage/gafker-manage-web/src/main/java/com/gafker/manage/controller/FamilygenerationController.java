package com.gafker.manage.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.pojo.Familygeneration;
import com.gafker.manage.pojo.FamilygenerationExample;
import com.gafker.manage.pojo.Familynames;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilygenerationService;
import com.gafker.manage.service.FamilynamesService;

@Controller
@RequestMapping("admin/gen")
public class FamilygenerationController implements BaseController<Familygeneration, Page, Familygeneration, String> {

	public static Logger logger1 = LogManager.getLogger(FamilygenerationController.class);

	@Autowired
	FamilygenerationService familygenerationService;
	@Autowired
	FamilynamesService familynamesService;

	@Override
	@RequestMapping(value="s",method=RequestMethod.GET)
	public String save(Model m) throws Exception {
		List<Familynames> namesList = familynamesService.listAll();
		m.addAttribute("cur_generation", new Familygeneration());
		m.addAttribute("names", namesList);
		return "admin/generation/generationform";
	}

	@Override
	@RequestMapping(value="s",method=RequestMethod.POST)
	public String save(@Valid Familygeneration record, Model m, BindingResult b) throws Exception {
		record.setSubbranch(0);
		record.setDelflag(0);
		int save = familygenerationService.save(record);
		if(save<=0){
			m.addAttribute("message", "加入辈份信息,失败！");
		}else{
			m.addAttribute("message", "成功加入辈份信息,继续添加！");
		}
		m.addAttribute("cur_generation", record);
		return "redirect:admin/gen/s";
	}

	@Override
	public String saveSelective(Familygeneration record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<Familygeneration> record, Model m, BindingResult b) throws Exception {
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
	public String updateByPrimaryKey(Familygeneration record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(Familygeneration record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(Familygeneration record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(Familygeneration record, Familygeneration con, Model m, BindingResult b)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<Familygeneration> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listAll(Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="q",method=RequestMethod.GET)
	public String listByCondition(Familygeneration c, Model m) throws Exception {
		FamilygenerationExample cr=new FamilygenerationExample();
		List<Familygeneration> listgen = familygenerationService.listByCondition(cr);
		m.addAttribute("generations", listgen);
		return "admin/generation/";
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, Familygeneration cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, Familygeneration cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Familygeneration record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(Familygeneration con, Model m) throws Exception {
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
	public String countByCondition(Familygeneration con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Familygeneration record, BindingResult b, Model m, HttpServletRequest request,
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
