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

import com.gafker.manage.pojo.Familybranch;
import com.gafker.manage.pojo.Familynames;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilybranchService;
import com.gafker.manage.service.FamilynamesService;

@Controller
@RequestMapping(value="admin/branch")
public class FamilybranchController implements BaseController<Familybranch, Page, Familybranch, String> {
	private static Logger logger1 = LogManager.getLogger(FamilybranchController.class);

	@Autowired
	FamilybranchService familybranchService; 
	
	@Autowired
	FamilynamesService familynamesService;
	
	@Override
	@RequestMapping(value="s",method=RequestMethod.GET)
	public String save(Model m) throws Exception {
		List<Familynames> names = familynamesService.listAll();
		List<Familybranch> branchlist = familybranchService.listAll();
		m.addAttribute("branchlist", branchlist);
		m.addAttribute("names", names);
		m.addAttribute("bran", new Familybranch());
		return "admin/branch/branchform";
	}

	@Override
	@RequestMapping(value="s",method=RequestMethod.POST)
	public String save(@Valid Familybranch record, Model m, BindingResult b) throws Exception {
		int save = familybranchService.save(record);
		if(save>0){
			m.addAttribute("message", "添加成功！");
		}else{
			m.addAttribute("message", "添加失败！");
		}
		m.addAttribute("bran", record);
		return "admin/branch/branchform";
	}

	@Override
	public String saveSelective(Familybranch record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<Familybranch> record, Model m, BindingResult b) throws Exception {
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
	public String updateByPrimaryKey(Familybranch record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(Familybranch record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(Familybranch record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(Familybranch record, Familybranch con, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<Familybranch> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listAll(Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByCondition(Familybranch c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, Familybranch cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, Familybranch cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Familybranch record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(Familybranch con, Model m) throws Exception {
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
	public String countByCondition(Familybranch con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Familybranch record, BindingResult b, Model m, HttpServletRequest request,
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
