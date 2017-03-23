package com.gafker.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gafker.manage.pojo.Familynames;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilynamesService;

/**
 * 加入世代信息
 * @author gafker
 *
 */
@Controller
@RequestMapping(value="admin/names")
public class FamilynamesController implements BaseController<Familynames, Page, Familynames, String> {
	
	public static Logger logger1 = LogManager.getLogger(FamilynamesController.class);
	
	@Autowired
	FamilynamesService familynamesService;

	@Override
	public String save(Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Familynames record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveSelective(Familynames record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<Familynames> record, Model m, BindingResult b) throws Exception {
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
	public String updateByPrimaryKey(Familynames record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(Familynames record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelective(Familynames record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByCondition(Familynames record, Familynames con, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<Familynames> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listAll(Model m) throws Exception {
		return null;
	}

	@Override
	public String listByCondition(Familynames c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, Familynames cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, Familynames cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Familynames record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(Familynames con, Model m) throws Exception {
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
	public String countByCondition(Familynames con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Familynames record, BindingResult b, Model m, HttpServletRequest request,
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
