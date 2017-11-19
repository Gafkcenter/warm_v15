package com.gafker.www.controller;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gafker.config.AppConfig;
import com.gafker.config.MvcConfig;
/**
 * 集成Web环境测试
 * spring mvc测试框架提供了两种方式，独立安装和集成Web环境测试（此种方式并不会集成真正的web环境，
 * 而是通过相应的Mock API进行模拟测试，无须启动服务器）。
 * @author gafker
 *
 */
//XML网络
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration(value="src/main/webapp")
//@ContextHierarchy({@ContextConfiguration(name="parent",locations="classpath:spring-config1.xml"),
//	@ContextConfiguration(name="child",locations="classpath:spring-mvc1.xml")})
//注解风格  
@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration(value = "src/main/webapp")  
@ContextHierarchy({  
      @ContextConfiguration(name = "parent", classes = AppConfig.class),  
      @ContextConfiguration(name = "child", classes = MvcConfig.class)  
})  
public class UserControllerWebAppContextSetupTest2 {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testUserview() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/100"))
		.andExpect(MockMvcResultMatchers.view().name("user/userView"))
		.andExpect(MockMvcResultMatchers.model().attributeExists("user"))
		.andDo(MockMvcResultHandlers.print())
		.andReturn();
		Assert.assertNotNull(result.getModelAndView().getModel().get("user"));
	}

}
