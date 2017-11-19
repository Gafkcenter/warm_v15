package com.gafker.manage.serviceImpl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.gafker.manage.service.FamilybranchService;

/**
 * 启运报错
 * @author gafker
 *
 */
public class FamilybranchServiceImplTest {
	private FamilybranchService familybranchService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		familybranchService = ctx.getBean(FamilybranchService.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveSelectiveFamilybranch() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKeyLong() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKeyInteger() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testListByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testListByPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPageByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPageByConditon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKeyFamilybranch() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKeyNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountByCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountBySelfCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveSelectiveFamilybranchHttpServletRequestHttpServletResponse() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsExistPrimaryKey() {
		fail("Not yet implemented");
	}

}
