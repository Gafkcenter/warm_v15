package com.gafker.manage.service.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.gafker.manage.entity.CookieTime;

public class CookiesUtil {
	public static Logger logger1 = LogManager.getLogger(CookiesUtil.class);

	public static void setCookies(String userName, HttpServletRequest req, HttpServletResponse res, String id)
			throws UnsupportedEncodingException {
		setCookie(res,"userName",URLEncoder.encode(userName, "UTF-8"),"/");
		setCookie(res,"userId",id,"/");
		setCookie(res,"sessionId",req.getSession().getId(),"/");
	}

	/*** 删除cookie */
	public static void clearCookie(HttpServletRequest request, HttpServletResponse response, String path) {
		Cookie[] cookies = request.getCookies();
		try {
			for (int i = 0; i < cookies.length; i++) {
				// System.out.println(cookies[i].getName() + ":" +cookies[i].getValue());
				Cookie cookie = new Cookie(cookies[i].getName(), null);
				cookie.setMaxAge(CookieTime.COOKIEEFFECTTIME);
				cookie.setPath(path);// 根据你创建cookie的路径进行填写
				response.addCookie(cookie);
			}
		} catch (Exception ex) {
			logger1.info("删除Cookies发生异常！");
		}
	}

	public static void setCookie(HttpServletResponse response, String name, String value, String path) {
		if (logger1.isDebugEnabled()) {
			logger1.debug("Setting cookie '" + name + "' on path '" + path + "'");
		}
		Cookie cookie = new Cookie(name, value);
		cookie.setSecure(false);
		cookie.setPath(path);
		cookie.setMaxAge(CookieTime.COOKIEEFFECTTIME);
		response.addCookie(cookie);
		logger1.info("setCookie 完成…….");
	} 
}
