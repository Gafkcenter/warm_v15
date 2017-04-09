package com.gafker.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.pojo.Familyproduct;
import com.gafker.manage.pojo.FamilytraceabilityExample;
import com.gafker.manage.pojo.form.FamilytraceabilityForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilyproductService;
import com.gafker.manage.service.FamilytraceabilityService;

@Controller
@RequestMapping(value = "tr")
public class FamilytraceabilityController
		implements BaseController<FamilytraceabilityForm, Page, FamilytraceabilityExample, String> {

	@Autowired
	FamilytraceabilityService familytraceabilityService;
	@Autowired
	FamilyproductService familyproductService;

	@Override
	@RequestMapping(value = "s", method = RequestMethod.GET)
	public String save(Model m) throws Exception {
		m.addAttribute("trace", new FamilytraceabilityForm());
		return "traceability/traceForm";
	}

	@RequestMapping(value = "{productId}/s", method = RequestMethod.GET)
	public String saveByProductId(@PathVariable Long productId, Model m) throws Exception {
		productId = null == productId ? 0l : productId;
		if (!familyproductService.isExistPrimaryKey(productId)) {
			m.addAttribute("message", productId + "没有这个产品！请先加入产品信息！");
		}
		Familyproduct product = familyproductService.selectByPrimaryKey(productId);
		FamilytraceabilityForm trace = new FamilytraceabilityForm();
		trace.setProductName(product!=null?product.getNamecn():"");
		trace.setFamilyproductFk(productId);
		m.addAttribute("trace", trace);
		return "traceability/traceForm";
	}

	@Override
	public String save(FamilytraceabilityForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "s", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute FamilytraceabilityForm record, BindingResult b, Model m,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		int result = familytraceabilityService.saveSelective(record, request, response);
		return "redirect:/tr/"+record.getFamilyproductFk()+"/trace";
	}

	@Override
	public String saveSelective(FamilytraceabilityForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<FamilytraceabilityForm> record, Model m, BindingResult b) throws Exception {
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
	public String updateByPrimaryKey(FamilytraceabilityForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(FamilytraceabilityForm record, Model m, BindingResult b, String id,
			Integer delFlag) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(FamilytraceabilityForm record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(FamilytraceabilityForm record, FamilytraceabilityExample con, Model m,
			BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<FamilytraceabilityForm> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "list", method = { RequestMethod.GET, RequestMethod.POST })
	public String listAll(Model m) throws Exception {
		List<FamilytraceabilityForm> traceList = familytraceabilityService.listAll();
		m.addAttribute("productId", 0);
		m.addAttribute("traceList", traceList);
		return "traceability/data";
	}

	@Override
	public String listByCondition(FamilytraceabilityExample c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByTwoConditon(Long userId, Long productId, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "{productId}/trace", method = RequestMethod.GET)
	public String findByOneConditon(@PathVariable Long productId, Model m) throws Exception {
		productId = null == productId ? 0l : productId;
		FamilytraceabilityForm form =new FamilytraceabilityForm();
		form.setFamilyproductFk(productId);
		List<FamilytraceabilityForm> traceList = familytraceabilityService.listByCondition(form);
		m.addAttribute("traceList", traceList);
		m.addAttribute("productId", productId);
		return "traceability/data";
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, FamilytraceabilityExample cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, FamilytraceabilityExample cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(FamilytraceabilityForm record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(FamilytraceabilityExample con, Model m) throws Exception {
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
	public String countByCondition(FamilytraceabilityExample con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
