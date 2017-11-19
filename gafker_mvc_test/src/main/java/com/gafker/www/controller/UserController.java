package com.gafker.www.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gafker.www.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/{id}")
	public ModelAndView userview(@PathVariable Long id, HttpServletRequest req) {
		User u = new User();
		u.setId(id);
		u.setName("Gafker");
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", u);
		mv.setViewName("user/userView");
		return mv;
	}

}
