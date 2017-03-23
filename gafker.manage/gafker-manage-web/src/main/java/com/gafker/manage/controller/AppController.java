package com.gafker.manage.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 应用主页
 * @author gafker
 *
 */
@Controller
@RequestMapping(value="app/")
public class AppController {
	public static Logger logger1 = LogManager.getLogger(HappayteachersdaysController.class);
	
	@RequestMapping(value="index" , method = RequestMethod.GET)
	public String adminIndex(){
		return "app/index";
	}
}
