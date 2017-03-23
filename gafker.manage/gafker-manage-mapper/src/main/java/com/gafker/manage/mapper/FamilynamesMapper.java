package com.gafker.manage.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gafker.manage.pojo.Familynames;
import com.gafker.manage.pojo.FamilynamesExample;

public interface FamilynamesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int countByExample(FamilynamesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int deleteByExample(FamilynamesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int insert(Familynames record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int insertSelective(Familynames record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	List<Familynames> selectByExample(FamilynamesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	Familynames selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Familynames record, @Param("example") FamilynamesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int updateByExample(@Param("record") Familynames record, @Param("example") FamilynamesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int updateByPrimaryKeySelective(Familynames record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	int updateByPrimaryKey(Familynames record);
}