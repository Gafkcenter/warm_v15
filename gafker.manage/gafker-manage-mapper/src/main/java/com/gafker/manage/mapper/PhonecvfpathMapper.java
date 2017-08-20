package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Phonecvfpath;
import com.gafker.manage.entity.PhonecvfpathExample;

public interface PhonecvfpathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    long countByExample(PhonecvfpathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int deleteByExample(PhonecvfpathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int insert(Phonecvfpath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int insertSelective(Phonecvfpath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    List<Phonecvfpath> selectByExample(PhonecvfpathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    Phonecvfpath selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByExampleSelective(@Param("record") Phonecvfpath record, @Param("example") PhonecvfpathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByExample(@Param("record") Phonecvfpath record, @Param("example") PhonecvfpathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByPrimaryKeySelective(Phonecvfpath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phonecvfpath
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByPrimaryKey(Phonecvfpath record);
}