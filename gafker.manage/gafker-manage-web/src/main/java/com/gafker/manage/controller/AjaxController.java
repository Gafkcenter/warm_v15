package com.gafker.manage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gafker.manage.pojo.Coffee;
import com.gafker.manage.pojo.User;

@RestController
public class AjaxController {

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String getLogin(HttpServletRequest request, HttpServletResponse response, User user) {
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		return user.getUserName();
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public List<User> getInfo(HttpServletRequest request, HttpServletResponse response, User user) {
		List<User> data = new ArrayList<User>();
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		data.add(user);
		return data;
	}

	@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
	public User getUser(HttpServletRequest request, HttpServletResponse response, User user) {
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		return user;
	}

	@RequestMapping(value = "/xml", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody Coffee  getXml(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Coffee coffee = new Coffee("Gafker", 100);
		return coffee;
		}
	@RequestMapping(value = "/listxml", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody List<Coffee>  getListXml(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Coffee> cofList = new ArrayList<Coffee>();
		for(int i=0;i<=100;i++){
			Coffee coffee = new Coffee();
			coffee.setQuanlity(i);
			coffee.setUserName("G"+i);
			cofList.add(coffee);
		}
		return cofList;
	}

}
