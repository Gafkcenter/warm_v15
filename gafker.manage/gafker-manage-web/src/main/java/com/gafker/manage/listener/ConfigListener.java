package com.gafker.manage.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.gafker.manage.service.ConfigService;
/**
 * 从数据库加载配置信息的监听器
 * @author gafker
 *
 */
public class ConfigListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void contextInitialized(ServletContextEvent sc) {
		//从spring 获取ConfigService
		ConfigService configService = WebApplicationContextUtils.getWebApplicationContext(sc.getServletContext())
				.getBean(ConfigService.class);
		configService.initConfig();

	}

}
