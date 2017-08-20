package com.gafker.manage.serviceImpl;

import com.gafker.manage.pojo.TimesTable;
import com.gafker.manage.pojo.TimesTableExample;
import com.gafker.manage.service.TimesTableService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by gafker on 2017/8/5.
 */
public class TimesTableServiceImplTest extends BaseJunit4Test {

    @Autowired
    TimesTableService timesTableService;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testSaveSelective() throws Exception {
            TimesTable t = MockData.mockInsertTimeTable();
            int result = timesTableService.saveSelective(t);
            Assert.assertTrue(result > 0);
    }

    @org.junit.Test
    public void testUpdateSelective() throws Exception {
    }

    @org.junit.Test
    public void testDelByPrimaryId() throws Exception {

    }

    @org.junit.Test
    public void testSelectByPrimaryId() throws Exception {

    }

    @org.junit.Test
    public void testSelectList() throws Exception {
        TimesTableExample example = new TimesTableExample();
       List<TimesTable> timeList =  timesTableService.selectList(example);
        if(timeList !=null && timeList.size()>=0){
            Assert.assertTrue(timeList.size()>=0);
        }else{
            Assert.assertTrue(false);
        }
    }
}