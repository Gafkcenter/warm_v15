package com.gafker.manage.service;

import com.gafker.manage.pojo.TimesTable;
import com.gafker.manage.pojo.TimesTableExample;

import java.util.List;

/**
 * Created by gafker on 2017/8/4.
 */
public interface TimesTableService {
    int saveSelective(TimesTable timesTable) throws Exception;
    int updateSelective(TimesTable timesTable) throws Exception;
    int delByPrimaryId(TimesTable timesTable) throws Exception;

    TimesTable selectByPrimaryId(long id) throws Exception;

    List<TimesTable> selectList(TimesTableExample timesTable) throws Exception;

}
