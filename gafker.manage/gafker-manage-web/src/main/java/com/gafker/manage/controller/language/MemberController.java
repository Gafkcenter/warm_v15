package com.gafker.manage.controller.language;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gafker.manage.interceptor.MemberInterceptor;
/**
 * 自定义拦截器实现登录测试
 * @author gafker
 *
 */
@Controller
@RequestMapping(value = "member")
public class MemberController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute(MemberInterceptor.SESSION_MEMBER);
		mv.setViewName("/member/index");
		mv.addObject("username", username);
		return mv;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("/member/list");
	}

}
