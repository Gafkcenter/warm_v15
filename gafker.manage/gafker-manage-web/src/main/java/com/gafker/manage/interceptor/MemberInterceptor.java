package com.gafker.manage.interceptor;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试Spring MVC登录拦截器
 * 
 * @author gafker
 *
 */
public class MemberInterceptor implements HandlerInterceptor {
	public static final String SESSION_MEMBER = "session_member";

	/** 
     * 可以考虑作权限，日志，事务等等 
     * 该方法在目标方法调用之前被调用； 
     * 若返回TURE,则继续调用后续的拦截器和目标方法 
     * 若返回FALSE,则不会调用后续的拦截器和目标方法 
     *  
     */  
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 请求的路径
		String contextPath = request.getContextPath();
		String url = request.getServletPath().toString();
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute(SESSION_MEMBER);
		// 这里可以根据session的用户来判断角色的权限，再做相关操作或重定向
		if (StringUtils.isEmpty(user)) {
			// 被拦截，重定向到login界面
			response.sendRedirect(contextPath + "/login.htm?redirectURL=" + URLEncoder.encode(url, "UTF-8"));
			return false;
		}
		return true;
	}
	/** 
     * 该方法在目标方法调用之后，渲染视图之前被调用； 
     * 可以对请求域中的属性或视图做出修改 
     *  
     */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}
	 /** 
     * 在渲染视图之后被调用； 
     * 可以用来释放资源 
     */ 
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
