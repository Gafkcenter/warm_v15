package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Userattribute;
import com.gafker.manage.entity.UserattributeExample;

public interface UserattributeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int countByExample(UserattributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int deleteByExample(UserattributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int insert(Userattribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int insertSelective(Userattribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	List<Userattribute> selectByExample(UserattributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	Userattribute selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Userattribute record, @Param("example") UserattributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int updateByExample(@Param("record") Userattribute record, @Param("example") UserattributeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int updateByPrimaryKeySelective(Userattribute record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table userattribute
	 * @mbggenerated  Tue Feb 28 02:16:11 CST 2017
	 */
	int updateByPrimaryKey(Userattribute record);
}