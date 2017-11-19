package com.gafker.www.controller;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.junit.Assert;

/**
 * >>独立安装<< spring mvc测试框架提供了两种方式，独立安装和集成Web环境测试（此种方式并不会集成真正的web环境， 而是通过相应的Mock
 * API进行模拟测试，无须启动服务器）。
 * 
 * @author gafker
 *
 */
public class UserControllerStandaloneSetupTest {
	private MockMvc mockMvc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		UserController userController = new UserController();
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserview() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/100"))
				.andExpect(MockMvcResultMatchers.view().name("user/userView"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("user")).andDo(MockMvcResultHandlers.print())
				.andReturn();
		Assert.assertNotNull(result.getModelAndView().getModel().get("user"));
	}

}
