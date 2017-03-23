package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.pojo.Familybooksection;
import com.gafker.manage.pojo.FamilybooksectionExample;

public interface FamilybooksectionMapper{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int countByExample(FamilybooksectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int deleteByExample(FamilybooksectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int insert(Familybooksection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int insertSelective(Familybooksection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    List<Familybooksection> selectByExample(FamilybooksectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    Familybooksection selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") Familybooksection record, @Param("example") FamilybooksectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int updateByExample(@Param("record") Familybooksection record, @Param("example") FamilybooksectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int updateByPrimaryKeySelective(Familybooksection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooksection
     *
     * @mbggenerated Sun Feb 19 19:50:51 CST 2017
     */
    int updateByPrimaryKey(Familybooksection record);
}