package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Familynews;
import com.gafker.manage.entity.FamilynewsExample;

public interface FamilynewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    long countByExample(FamilynewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int deleteByExample(FamilynewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int insert(Familynews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int insertSelective(Familynews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    List<Familynews> selectByExample(FamilynewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    Familynews selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int updateByExampleSelective(@Param("record") Familynews record, @Param("example") FamilynewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int updateByExample(@Param("record") Familynews record, @Param("example") FamilynewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int updateByPrimaryKeySelective(Familynews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familynews
     *
     * @mbg.generated Tue Mar 21 11:41:48 CST 2017
     */
    int updateByPrimaryKey(Familynews record);
}