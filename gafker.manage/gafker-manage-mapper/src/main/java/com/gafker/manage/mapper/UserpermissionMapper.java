package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Userpermission;
import com.gafker.manage.entity.UserpermissionExample;

public interface UserpermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int countByExample(UserpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int deleteByExample(UserpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int insert(Userpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int insertSelective(Userpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    List<Userpermission> selectByExample(UserpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    Userpermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") Userpermission record, @Param("example") UserpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByExample(@Param("record") Userpermission record, @Param("example") UserpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByPrimaryKeySelective(Userpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByPrimaryKey(Userpermission record);
}