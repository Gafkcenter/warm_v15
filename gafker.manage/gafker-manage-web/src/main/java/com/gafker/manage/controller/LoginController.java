package com.gafker.manage.controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.service.UserAttributeService;
import com.gafker.manage.service.utils.CookiesUtil;

@Controller
@RequestMapping(value = "security")
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	UserAttributeService userAttributeService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Model m) {
		m.addAttribute("userattribute", new Userattribute());
		return "security/login";
	}
	@RequestMapping(value = "dologin", method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("userattribute") Userattribute userattribute, Errors b,HttpServletRequest request,HttpServletResponse response,Model m) throws Exception {
		if(b.hasErrors()){
			m.addAttribute("userattribute", userattribute);
			return "security/login";
		}
		String serverCode = (String) request.getSession().getAttribute("serverCode");
		logger.info("userCode:" + userattribute.getRegcode() + " serverCode:" + serverCode);
		if (!userattribute.getRegcode().equalsIgnoreCase(serverCode)) {
			m.addAttribute("message", "验证码错误!");
			m.addAttribute("userattribute", userattribute);
			return "security/login";
		}
		String msg;
		UsernamePasswordToken token = new UsernamePasswordToken(userattribute.getUsername(), userattribute.getPassword());
		token.setRememberMe(true);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			if (subject.isAuthenticated()) {
				userattribute = userAttributeService.findByCondition(userattribute);
				request.getSession().setAttribute("user", userattribute);
				//设置Cookies
	            CookiesUtil.setCookies(userattribute.getUsername(),request, response, userattribute.getId().toString());
				SavedRequest savedRequest = WebUtils.getSavedRequest(request);
				// 获取保存的URL
				if (savedRequest == null || savedRequest.getRequestUrl() == null) {
					return "admin/home";
				} else {
					// String url = savedRequest.getRequestUrl().substring(12,
					// savedRequest.getRequestUrl().length());
					logger.info(savedRequest.getRequestURI() + "..." + savedRequest.getRequestUrl().substring(1));
					logger.info("forward:" + savedRequest.getRequestUrl());
					//重定向报错
//					return "forward:" + savedRequest.getRequestUrl();
					return "redirect:/t/l";
				}
			} else {
				return "redirect:security/login";
			}
		} catch (IncorrectCredentialsException e) {
			msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
			m.addAttribute("message", msg);
		} catch (ExcessiveAttemptsException e) {
			msg = "登录失败次数过多";
			m.addAttribute("message", msg);
		} catch (LockedAccountException e) {
			msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
			m.addAttribute("message", msg);
		} catch (DisabledAccountException e) {
			msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
			m.addAttribute("message", msg);
		} catch (ExpiredCredentialsException e) {
			msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
			m.addAttribute("message", msg);
		} catch (UnknownAccountException e) {
			msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
			m.addAttribute("message", msg);
		} catch (UnauthorizedException e) {
			msg = "您没有得到相应的授权！" + e.getMessage();
			m.addAttribute("message", msg);
		}
		m.addAttribute("user",userattribute);
		return "security/login";
	}

	@RequestMapping(value = "logout")
	public String doLogout(HttpServletRequest request,HttpServletResponse response, RedirectAttributes m) {
		logger.info("======用户" + request.getSession().getAttribute("user") + "退出了系统");
		
			SecurityUtils.getSubject().logout();
			m.addAttribute("user", null);
		return "redirect:/t/l";
	}

	public String register(Userattribute user, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
		MultipartFile files = null;
		int save = userAttributeService.saveInfo(user, request, response, files);
		model.addAttribute("message", "注册成功!");
		if(save<=0){
			model.addAttribute("message", "注册失败!");
		}
		return "admin/home";
		
	}

	/**
	 * 验证码
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "regcode", method = RequestMethod.GET)
	public void getCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 建立图像缓存
		// 建立绘制图片对象Graphics
		// 获取颜色
		// 设置图片位置大小
		BufferedImage bi = new BufferedImage(70, 30, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		Color c = new Color(240, 230, 140);
		g.setColor(c);
		g.fillRect(0, 0, 70, 30);
		// 设置随机数范围
		// 通随机数对象获取对应位置字符
		char[] codes = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int len = codes.length;
		for (int i = 0; i < 4; i++) {
			int index = r.nextInt(len);
			// 随机设定当前的字符颜色
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawString(codes[index] + "", i * 17 + 9, 20);
			sb.append(codes[index]);
		}
		// 保存当前验证码字符串
		// 绘制对应验证码的图象
		request.getSession().setAttribute("serverCode", sb.toString());
		ImageIO.write(bi, "JPG", response.getOutputStream());
	}
}
