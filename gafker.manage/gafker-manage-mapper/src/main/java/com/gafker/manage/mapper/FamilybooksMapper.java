package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Familybooks;
import com.gafker.manage.entity.FamilybooksExample;

public interface FamilybooksMapper{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int countByExample(FamilybooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int deleteByExample(FamilybooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int insert(Familybooks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int insertSelective(Familybooks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    List<Familybooks> selectByExample(FamilybooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    Familybooks selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int updateByExampleSelective(@Param("record") Familybooks record, @Param("example") FamilybooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int updateByExample(@Param("record") Familybooks record, @Param("example") FamilybooksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int updateByPrimaryKeySelective(Familybooks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familybooks
     *
     * @mbggenerated Fri Feb 17 09:21:29 CST 2017
     */
    int updateByPrimaryKey(Familybooks record);
}