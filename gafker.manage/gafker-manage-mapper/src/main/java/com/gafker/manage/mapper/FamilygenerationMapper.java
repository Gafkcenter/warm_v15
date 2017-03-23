package com.gafker.manage.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gafker.manage.pojo.Familygeneration;
import com.gafker.manage.pojo.FamilygenerationExample;

public interface FamilygenerationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int countByExample(FamilygenerationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int deleteByExample(FamilygenerationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int insert(Familygeneration record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int insertSelective(Familygeneration record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	List<Familygeneration> selectByExample(FamilygenerationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	Familygeneration selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Familygeneration record,
			@Param("example") FamilygenerationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int updateByExample(@Param("record") Familygeneration record, @Param("example") FamilygenerationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int updateByPrimaryKeySelective(Familygeneration record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familygeneration
	 * @mbggenerated  Fri Feb 24 23:17:29 CST 2017
	 */
	int updateByPrimaryKey(Familygeneration record);
}