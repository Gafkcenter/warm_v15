package com.gafker.manage.filtter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 权限认证
 * 
 * @author gafker
 *
 */
public class SecurityServlet extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3415216276937884923L;
	public static Logger logger1 =LogManager.getLogger(SecurityServlet.class);

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession(true);
		String usercode = request.getRemoteUser();// 登录人
		Object user_role = session.getAttribute("role");// 登录人角色
		String url = request.getRequestURI();
		if(logger1.isDebugEnabled()){
			logger1.info("用户请求信息   usercode:"+usercode+" user_role:"+user_role+" url:"+url);
		}
		// 没有登录，没有角色时进入
		if (usercode == null || "".equals(usercode) || user_role == null || "".equals(user_role)) {
			// 无权限且url不为空、不为登录页面时跳转登录页面----从而实现权限拦截
			if (url != null && !url.equals("") && (url.indexOf("Login") < 0 && url.indexOf("login") < 0)) {
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				if(logger1.isDebugEnabled()){
					logger1.info("登录"+request.getContextPath() + "/login.jsp 无权限被拦截---用户请求信息   usercode:"+usercode+" user_role:"+user_role+" url:"+url);
				}
				return;
			}
		}
		arg2.doFilter(arg0, arg1);
		return;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}
}
