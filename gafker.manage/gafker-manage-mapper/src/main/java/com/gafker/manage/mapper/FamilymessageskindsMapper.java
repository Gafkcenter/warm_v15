package com.gafker.manage.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gafker.manage.pojo.Familymessageskinds;
import com.gafker.manage.pojo.FamilymessageskindsExample;

public interface FamilymessageskindsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int countByExample(FamilymessageskindsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int deleteByExample(FamilymessageskindsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int insert(Familymessageskinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int insertSelective(Familymessageskinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	List<Familymessageskinds> selectByExample(FamilymessageskindsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	Familymessageskinds selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Familymessageskinds record,
			@Param("example") FamilymessageskindsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int updateByExample(@Param("record") Familymessageskinds record,
			@Param("example") FamilymessageskindsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int updateByPrimaryKeySelective(Familymessageskinds record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	int updateByPrimaryKey(Familymessageskinds record);
}