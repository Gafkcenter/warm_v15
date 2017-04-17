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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.pojo.Familynames;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.request.HappayteachersdaysRequest;
import com.gafker.manage.service.FamilynamesService;
import com.gafker.manage.service.UserAttributeService;
import com.gafker.manage.service.utils.CookiesUtil;

@Controller
@RequestMapping("user")
public class UserAttributeController {
	private static List<Familynames> FAMILY_NAMES = null;

	@Autowired
	private UserAttributeService userAttributeService;

	@Autowired
	private FamilynamesService familynamesService;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerUser(Model model) throws Exception {
		model.addAttribute("userattribute", new Userattribute());
		List<Familynames> names = familynamesService.listAll();
		FAMILY_NAMES = names;
		model.addAttribute("names", names);
		return "security/register";

	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute Userattribute userattribute, BindingResult b,
			HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
		if (b.hasErrors()) {
			model.addAttribute("userattribute", userattribute);
			model.addAttribute("names", FAMILY_NAMES);
			return "security/register";
		}
		Userattribute userInfo = userAttributeService.findByCondition(userattribute);
		if (!(userInfo == null)) {
			model.addAttribute("message", "用户已经存在!");
			model.addAttribute("userattribute", userattribute);
			model.addAttribute("names", FAMILY_NAMES);
			return "security/register";
		}
		MultipartFile files = null;
		int saveInfo = userAttributeService.saveInfo(userattribute, req, res, files);
		if (saveInfo > 0) {
			userAttributeService.updateByPrimaryKey(userattribute);
			req.getSession().setAttribute("user", userattribute);
			return "admin/home";
		}
		userattribute = userAttributeService.findByCondition(userattribute);
		model.addAttribute("message", "注册失败!");
		model.addAttribute("userattribute", userattribute);
		model.addAttribute("names", FAMILY_NAMES);
		return "security/register";
	}

	@RequestMapping(value = "regwarmuser", method = RequestMethod.GET)
	public void registerUserAjax(HappayteachersdaysRequest data, BindingResult b, HttpServletRequest req,
			HttpServletResponse res, Model model) throws Exception {
		String teacher = new String(data.getTeachers().getBytes("ISO8859-1"),"UTF-8") ;
		String student = new String(data.getStudents().getBytes("ISO8859-1"),"UTF-8");
		if (teacher != null) {
			Userattribute userattribute = new Userattribute();
			userattribute.setUsername(data.getTeachers());
			Userattribute userInfo = userAttributeService.findByCondition(userattribute);
			if (userInfo == null) {
				MultipartFile files = null;
				userAttributeService.saveInfo(userattribute, req, res, files);
			}
		}
		
		if (student != null) {
			Userattribute userattribute = new Userattribute();
			userattribute.setUsername(data.getStudents());
			Userattribute userInfo = userAttributeService.findByCondition(userattribute);
			int result=0;
			if (userInfo == null) {
				//注册
				MultipartFile files = null;
				result = userAttributeService.saveInfo(userattribute, req, res, files);
			}
			if(result>0){
				userAttributeService.updateByPrimaryKey(userattribute);
			}
		}
	}

	@RequestMapping("logout")
	public String registerLogOut(HttpServletRequest req, HttpServletResponse res) throws Exception {
		CookiesUtil.clearCookie(req, res, "/");
		return "redirect:/t/l";
	}

}
