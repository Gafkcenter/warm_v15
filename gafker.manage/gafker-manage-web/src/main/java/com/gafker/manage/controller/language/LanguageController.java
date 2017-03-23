package com.gafker.manage.controller.language;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

@Controller
@RequestMapping(value = "lan")
public class LanguageController {
	@Autowired
	CookieLocaleResolver resolver;

	/**
	 * 语言切换
	 */
	@RequestMapping(value = "sh", method = RequestMethod.GET)
	public ModelAndView language(HttpServletRequest request, HttpServletResponse response, String language) {
		new JedisConnectionFactory();
		language = language.toLowerCase();
		if (language == null || language.equals("")) {
			return new ModelAndView("redirect:/");
		} else {
			if (language.equals("zh_cn")) {
				resolver.setLocale(request, response, Locale.CHINA);
			} else if (language.equals("en")) {
				resolver.setLocale(request, response, Locale.ENGLISH);
			} else {
				resolver.setLocale(request, response, Locale.CHINA);
			}
		}

		return new ModelAndView("redirect:/");
	}
}
