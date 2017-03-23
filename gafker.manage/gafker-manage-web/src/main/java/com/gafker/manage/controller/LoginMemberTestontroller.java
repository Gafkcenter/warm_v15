package com.gafker.manage.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gafker.manage.interceptor.MemberInterceptor;

/**
 * 测试Spring MVC登录拦截器
 * 自定义拦截器实现登录测试
 * @author gafker
 *
 */
@Controller
public class LoginMemberTestontroller {

	@RequestMapping(value = "loginmember", method = RequestMethod.GET)
	public ModelAndView login(String redirectURL, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		// 保存拦截前的路径,以便登录完成后再访问到原访问路径。
		mv.addObject("redirectURL", redirectURL);
		mv.setViewName("/loginmember");
		return mv;
	}

	@RequestMapping(value = "submit", method = RequestMethod.POST)
	public String submit(String username, String password, String redirectURL, HttpServletRequest request,RedirectAttributes ra)
			throws UnsupportedEncodingException {
		// 模拟登录成功 admin密码admin
		if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password) && username.equals("admin")
				&& password.equals("admin")) {
			// 登录成功是将用户信息放到session中去
			HttpSession session = request.getSession();
			session.setAttribute(MemberInterceptor.SESSION_MEMBER, "admin");
			if (StringUtils.isNoneBlank(redirectURL)) {
				return "redirect:" + URLDecoder.decode(redirectURL, "UTF-8");
			}
			ra.addFlashAttribute("me", "登录成功！");
			return "redirect:/member/index";
		} else {
			if (StringUtils.isNotBlank(redirectURL)) {
				return "redirect:/loginmember?" + URLDecoder.decode(redirectURL, "UTF-8	");
			}
			ra.addFlashAttribute("me", "请先登录！");
			return "redirect:/loginmember";
		}
	}
}
