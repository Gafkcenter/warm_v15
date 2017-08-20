package com.gafker.manage.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gafker.manage.entity.Visitorcount;
import com.gafker.manage.entity.Visitorlog;
import com.gafker.manage.service.VisitorcountService;
import com.gafker.manage.service.VisitorlogService;

public class LogInterceptors implements HandlerInterceptor {
	public static final Logger logger1 = LogManager.getLogger(LogInterceptors.class);

	@Autowired
	private VisitorlogService visitorlogService;
	@Autowired
	private VisitorcountService visitorcountService;

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
		String requestURI = request.getRequestURI();
		boolean boo=requestURI.endsWith(".jpg")||requestURI.endsWith(".gif")||requestURI.endsWith(".ico")||requestURI.endsWith(".css")||requestURI.endsWith(".js")||requestURI.endsWith(".png");
		int size = 0;
		if(!boo){
			Visitorlog log=new Visitorlog();
			log.setCreatetime(new Date());
			log.setUseragent(request.getHeader("user-agent"));
			log.setUserip(request.getRemoteAddr());
			log.setUri(request.getRequestURI());
			log.setTimecycle(System.currentTimeMillis()+0d);
			log.setCreateuser(request.getRemoteUser());
			size = visitorlogService.saveSelective(log);
		}
		if(logger1.isDebugEnabled()){
			logger1.info("日志记录开始！。。。"+size);
		}
		return true;
	}

	/**
	 * 该方法在目标方法调用之后，渲染视图之前被调用； 可以对请求域中的属性或视图做出修改
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (logger1.isDebugEnabled()) {
			logger1.info("方法执行日志记录完成，开始执行宣染！。。。");
		}
	}

	/**
	 * 在渲染视图之后被调用； 可以用来释放资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String requestURI = request.getRequestURI();
		boolean boo=requestURI.endsWith(".jpg")||requestURI.endsWith(".gif")||requestURI.endsWith(".ico")||requestURI.endsWith(".css")||requestURI.endsWith(".js")||requestURI.endsWith(".png");
		int size = 0;
		if(!boo){
			Visitorcount log=new Visitorcount();
			log.setCreatetime(new Date());
			log.setUri(request.getRequestURI());
			log.setIp(request.getRemoteAddr());
			log.setVisitoruser(request.getRemoteUser());
			log.setVisitortimes(1l);
			size = visitorcountService.saveOrUpdate(log);
		}
		if (logger1.isDebugEnabled()) {
			logger1.info("宣染日志记录完成！开始释放资源。。。"+size);
		}
	}

}
