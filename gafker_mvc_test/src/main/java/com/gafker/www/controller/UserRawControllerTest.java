package com.gafker.www.controller;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.ModelAndView;
/**
 * 这种方式的缺点已经说过了，如不能走Spring MVC完整流程（
 * 不能走Servlet的过滤器链、SpringMVC的类型转换、数据验证、数据绑定、拦截器等等），
 * 如果做基本的测试没问题，这种方式就是纯粹的单元测试，我们想要的功能其实是一种集成测试，不过后续部分不区分。
 * @author gafker
 *
 */
public class UserRawControllerTest {
	
	private UserController userController;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userController = new UserController();
		//安装userCtroller依赖 比如userService 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserview() {
		MockHttpServletRequest	req = new MockHttpServletRequest();
		ModelAndView mv = userController.userview(1l, req);
		ModelAndViewAssert.assertViewName(mv, "user/userView");
		ModelAndViewAssert.assertModelAttributeAvailable(mv, "user");
	}

}
