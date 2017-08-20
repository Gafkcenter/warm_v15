package com.gafker.manage.serviceImpl;

import com.gafker.manage.mapper.TimesTableMapper;
import com.gafker.manage.pojo.TimesTable;
import com.gafker.manage.pojo.TimesTableExample;
import com.gafker.manage.service.TimesTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gafker on 2017/8/4.
 */

@Service
@Transactional
public class TimesTableServiceImpl implements TimesTableService{
    @Autowired
    TimesTableMapper  timesTableMapper;
    @Override
    public int saveSelective(TimesTable timesTable) throws Exception {
        int result = 0;
        if(timesTable.getStartTime()>=0) {
         result =  timesTableMapper.insertSelective(timesTable);
        }
        return result;
    }

    @Override
    public int updateSelective(TimesTable timesTable) throws Exception {
        return timesTableMapper.updateByPrimaryKey(timesTable);
    }

    @Override
    public int delByPrimaryId(TimesTable timesTable) throws Exception {
        return 0;
    }

    @Override
    public TimesTable selectByPrimaryId(long id) throws Exception {
        return timesTableMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TimesTable> selectList(TimesTableExample timesTable) throws Exception {
        timesTable.setOrderByClause("id DESC");
        timesTableMapper.selectByExample(timesTable);
        return timesTableMapper.selectByExample(timesTable);
    }
}
