package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Userfkpermission;
import com.gafker.manage.entity.UserfkpermissionExample;

public interface UserfkpermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int countByExample(UserfkpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int deleteByExample(UserfkpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int insert(Userfkpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int insertSelective(Userfkpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    List<Userfkpermission> selectByExample(UserfkpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    Userfkpermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") Userfkpermission record, @Param("example") UserfkpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByExample(@Param("record") Userfkpermission record, @Param("example") UserfkpermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByPrimaryKeySelective(Userfkpermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userfkpermission
     *
     * @mbggenerated Mon Feb 20 08:46:09 CST 2017
     */
    int updateByPrimaryKey(Userfkpermission record);
}