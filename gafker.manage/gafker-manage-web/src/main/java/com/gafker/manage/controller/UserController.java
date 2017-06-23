package com.gafker.manage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gafker.manage.entity.User;
import com.gafker.manage.service.IUserService;

/**
 * 参数传递，最简单的DEMO
 * @author HuangMinghao
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";
	}
	
	/**
	 * 测试自定义权限过虑器
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/testmysecurity.gafker")
	public String testMySecurity(HttpServletRequest request,HttpServletResponse response){
		return "/app/index";
	}
}
