package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Phoneseven;
import com.gafker.manage.entity.PhonesevenExample;

public interface PhonesevenMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	long countByExample(PhonesevenExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int deleteByExample(PhonesevenExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int insert(Phoneseven record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int insertSelective(Phoneseven record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	List<Phoneseven> selectByExample(PhonesevenExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	Phoneseven selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Phoneseven record, @Param("example") PhonesevenExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int updateByExample(@Param("record") Phoneseven record, @Param("example") PhonesevenExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int updateByPrimaryKeySelective(Phoneseven record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	int updateByPrimaryKey(Phoneseven record);

	/**
	 * 批量保存
	 * @param sList
	 * @return
	 */
	int insertBatch(List<Phoneseven> sList);
}