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

import com.gafker.manage.entity.Familyproduct;
import com.gafker.manage.entity.FamilyproductExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Userattribute;
import com.gafker.manage.entity.FamilyproductExample.Criteria;
import com.gafker.manage.pojo.FamilyproductForm;
import com.gafker.manage.service.FamilyproductService;
import com.gafker.manage.service.UserAttributeService;

/**
 * p:product
 * @author gafker
 *
 */
@Controller
@RequestMapping(value="p")
public class FamilyproductController implements BaseController<FamilyproductForm, Page, FamilyproductExample, String> {

	@Autowired
	FamilyproductService familyproductService;
	
	@Autowired
	UserAttributeService userAttributeService;
	
	@Override
	@RequestMapping(value={"s","/"},method=RequestMethod.GET)
	public String save(Model m) throws Exception {
		m.addAttribute("product", new FamilyproductForm());
		return "product/productForm";
	}
	@Override
	public String save(FamilyproductForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@RequestMapping(value="s",method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute FamilyproductForm record, BindingResult b, Model m, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if(b.hasErrors()){
			m.addAttribute("product", record);
			return "product/productForm";
		}
		int result = familyproductService.saveSelective(record,request,response);
		m.addAttribute("product", new Familyproduct());
		return "product/productForm";
	}

	@Override
	public String saveSelective(FamilyproductForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<FamilyproductForm> record, Model m, BindingResult b) throws Exception {
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
	public String updateByPrimaryKey(FamilyproductForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(FamilyproductForm record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(FamilyproductForm record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(FamilyproductForm record, FamilyproductExample con, Model m, BindingResult b)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<FamilyproductForm> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="l",method=RequestMethod.GET)
	public String listAll(Model m) throws Exception {
		List<Familyproduct> data = familyproductService.listAll();
		m.addAttribute("productList", data);
		return "product/data";
	}

	@Override
	public String listByCondition(FamilyproductExample c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, FamilyproductExample cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@RequestMapping(value="{userId}/{productId}",method=RequestMethod.GET)
	public String findByTwoConditon(@PathVariable Long userId,@PathVariable Long productId, Model m) throws Exception {
		userId = null==userId?0l:userId;
		productId = null==productId?0l:productId;
		FamilyproductExample c = new FamilyproductExample();
		Criteria criteria = c.createCriteria();
		criteria.andCreatebyEqualTo(userId).andIdEqualTo(productId);
		Familyproduct product = familyproductService.findByCondition(c);
		Userattribute userInfo = userAttributeService.setUserContactPhone(userId);
		m.addAttribute("product", product);
		m.addAttribute("userInfo", userInfo);
		return "product/details";
	}
	@RequestMapping(value="/t/{userId}/{productId}",method=RequestMethod.GET)
	public String findByTwoConditonTra(@PathVariable Long userId,@PathVariable Long productId, Model m) throws Exception {
		String viewString = this.findByTwoConditon(userId, productId, m);
		return viewString;
	}

	@Override
	public String listPageByConditon(Page page, FamilyproductExample cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(FamilyproductForm record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(FamilyproductExample con, Model m) throws Exception {
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
	public String countByCondition(FamilyproductExample con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@RequestMapping(value="{userId}",method=RequestMethod.GET)
	public String findByOneConditon(@PathVariable Long userId, Model m) throws Exception {
		userId=null!=userId?userId:0l;
		FamilyproductExample c=new FamilyproductExample();
		c.createCriteria().andCreatebyEqualTo(userId);
		c.setOrderByClause("id DESC");
		List<Familyproduct> productList = familyproductService.listByCondition(c);
		m.addAttribute("productList", productList);
		return "product/data";
	}
}
