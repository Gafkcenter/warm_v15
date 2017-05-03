package com.gafker.manage.mapper;

import com.gafker.manage.pojo.Phoneuseuser;
import com.gafker.manage.pojo.PhoneuseuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneuseuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    long countByExample(PhoneuseuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int deleteByExample(PhoneuseuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int insert(Phoneuseuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int insertSelective(Phoneuseuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    List<Phoneuseuser> selectByExample(PhoneuseuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    Phoneuseuser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByExampleSelective(@Param("record") Phoneuseuser record, @Param("example") PhoneuseuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByExample(@Param("record") Phoneuseuser record, @Param("example") PhoneuseuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByPrimaryKeySelective(Phoneuseuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phoneuseuser
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    int updateByPrimaryKey(Phoneuseuser record);
}