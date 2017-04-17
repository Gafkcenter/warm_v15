package com.gafker.manage.mapper;

import com.gafker.manage.pojo.SysJacketSize;
import com.gafker.manage.pojo.SysJacketSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJacketSizeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	long countByExample(SysJacketSizeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int deleteByExample(SysJacketSizeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int insert(SysJacketSize record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int insertSelective(SysJacketSize record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	List<SysJacketSize> selectByExample(SysJacketSizeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	SysJacketSize selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SysJacketSize record, @Param("example") SysJacketSizeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int updateByExample(@Param("record") SysJacketSize record, @Param("example") SysJacketSizeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int updateByPrimaryKeySelective(SysJacketSize record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_jacket_size
	 * @mbg.generated  Sat Apr 15 16:11:06 CST 2017
	 */
	int updateByPrimaryKey(SysJacketSize record);
}