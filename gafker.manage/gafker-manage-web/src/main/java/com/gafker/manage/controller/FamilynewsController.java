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

import com.gafker.manage.pojo.Familynews;
import com.gafker.manage.pojo.FamilynewsExample;
import com.gafker.manage.pojo.FamilynewsExample.Criteria;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.form.FamilynewsForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilynewsService;

@Controller
@RequestMapping(value="news")
public class FamilynewsController implements BaseController<FamilynewsForm, Page, Familynews, String> {
	
	@Autowired
	FamilynewsService familynewsService;

	@Override
	@RequestMapping(value="s",method=RequestMethod.GET)
	public String save(Model m) throws Exception {
		m.addAttribute("familyNews", new Familynews());
		return "news/newsForm";
	}

	@Override
	public String save(FamilynewsForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="s",method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute FamilynewsForm record, BindingResult b, Model m, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if(b.hasErrors()){
			m.addAttribute("familyNews", record);
			return "news/newsForm";
		}
		familynewsService.saveSelective(record);
		Long id = getUserIdInSession(request);
		return "redirect:/news/l/"+id;
	}

	private Long getUserIdInSession(HttpServletRequest request) {
		Long id=0l;
		Userattribute u = (Userattribute)request.getSession().getAttribute("user");
		if(null !=u) {
			id = u.getId();
		}
		return id;
	}

	@Override
	public String saveSelective(FamilynewsForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveBatch(List<FamilynewsForm> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String update(@PathVariable Long newsId, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 点赞
	 */
	@RequestMapping(value="u/{ids}",method=RequestMethod.GET)
	public String updateStar(@PathVariable(value="ids") String ids, Model m) throws Exception {
		String[] split = ids.split(":");
		Long newsId = Long.valueOf(split[0]);
		String userId = split[1];
		userId=null==userId?"0":userId;
		Familynews record=new Familynews();
		record.setId(newsId);
		FamilynewsExample con=new FamilynewsExample();
		Criteria createCriteria = con.createCriteria();
		createCriteria.andCreateByEqualTo(newsId);
		familynewsService.updateByCondition(record, con);
		return "redirect:/news/l/"+userId;
	}

	@Override
	
	public String update(Integer id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByPrimaryKey(FamilynewsForm record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSelectiveAjax(FamilynewsForm record, Model m, BindingResult b, String id, Integer delFlag)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 假删除，隐藏,没有测试
	 */
	@Override
	@RequestMapping(value="u/{newsId}/{delFlag}",method=RequestMethod.GET)
	public String updateSelective(FamilynewsForm record, Model m, BindingResult b,@PathVariable String newsId, @PathVariable Integer delFlag)
			throws Exception {
		Long newsRecordId = Long.valueOf(newsId);
		record.setId(newsRecordId);
		record.setDelStatus(delFlag==0?1:0);
		familynewsService.updateSelective(record);
		return "redirect:/news/l/0";
	}

	@Override
	public String updateByCondition(FamilynewsForm record, Familynews con, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBatch(List<FamilynewsForm> record, Model m, BindingResult b) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="l/i",method=RequestMethod.GET)
	public String listAll(Model m) throws Exception {
		List<FamilynewsForm> familyNewsList = familynewsService.listAll();
		m.addAttribute("familyNewsList", familyNewsList);
		return "news/data";
	}

	@Override
	public String listByCondition(Familynews c, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByTwoConditon(Long userId, Long productId, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="l/{userId}",method=RequestMethod.GET)
	public String findByOneConditon(@PathVariable Long userId, Model m) throws Exception {
		List<FamilynewsForm> listByCondition = listByUserId(userId);
		m.addAttribute("familyNewsList", listByCondition);
		return "news/data";
	}

	private List<FamilynewsForm> listByUserId(Long userId) throws Exception {
		userId=null==userId?01:userId;
		FamilynewsExample c=new FamilynewsExample();
		Criteria createCriteria = c.createCriteria();
		createCriteria.andCreateByEqualTo(userId);
		List<FamilynewsForm> listByCondition = familynewsService.listByCondition(c);
		return listByCondition;
	}

	@Override
	public String listByPage(Page page, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByCondition(Page page, Familynews cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listPageByConditon(Page page, Familynews cond, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(FamilynewsForm record, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByPrimaryKey(Number id, Model m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteByCondition(Familynews con, Model m) throws Exception {
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
	public String countByCondition(Familynews con) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countBySelfCondition(FamilynewsForm record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
