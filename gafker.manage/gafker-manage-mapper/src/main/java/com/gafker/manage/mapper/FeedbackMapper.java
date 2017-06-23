package com.gafker.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gafker.manage.entity.Feedback;
import com.gafker.manage.entity.FeedbackExample;

public interface FeedbackMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	long countByExample(FeedbackExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int deleteByExample(FeedbackExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int insert(Feedback record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int insertSelective(Feedback record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	List<Feedback> selectByExample(FeedbackExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	Feedback selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int updateByPrimaryKeySelective(Feedback record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feedback
	 * @mbg.generated  Mon Mar 20 21:13:37 CST 2017
	 */
	int updateByPrimaryKey(Feedback record);
}