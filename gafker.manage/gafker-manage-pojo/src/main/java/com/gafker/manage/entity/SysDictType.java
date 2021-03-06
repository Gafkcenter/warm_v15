package com.gafker.manage.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;

public class SysDictType implements Serializable{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.id
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.NameEn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private String nameen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.NameCn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	@Pattern(regexp = "\\w+", message = "输入字母,数字或下划线")
	private String namecn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.description
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.Idx
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private Integer idx;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.WebUrls
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private String weburls;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.AdsIds__fk
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private String adsidsFk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.CreateBy
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private Integer createby;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.CreateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private Date createtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_type.UpdateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	private Date updatetime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.id
	 * @return  the value of sys_dict_type.id
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.id
	 * @param id  the value for sys_dict_type.id
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.NameEn
	 * @return  the value of sys_dict_type.NameEn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public String getNameen() {
		return nameen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.NameEn
	 * @param nameen  the value for sys_dict_type.NameEn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setNameen(String nameen) {
		this.nameen = nameen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.NameCn
	 * @return  the value of sys_dict_type.NameCn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public String getNamecn() {
		return namecn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.NameCn
	 * @param namecn  the value for sys_dict_type.NameCn
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setNamecn(String namecn) {
		this.namecn = namecn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.description
	 * @return  the value of sys_dict_type.description
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.description
	 * @param description  the value for sys_dict_type.description
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.Idx
	 * @return  the value of sys_dict_type.Idx
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public Integer getIdx() {
		return idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.Idx
	 * @param idx  the value for sys_dict_type.Idx
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.WebUrls
	 * @return  the value of sys_dict_type.WebUrls
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public String getWeburls() {
		return weburls;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.WebUrls
	 * @param weburls  the value for sys_dict_type.WebUrls
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setWeburls(String weburls) {
		this.weburls = weburls;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.AdsIds__fk
	 * @return  the value of sys_dict_type.AdsIds__fk
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public String getAdsidsFk() {
		return adsidsFk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.AdsIds__fk
	 * @param adsidsFk  the value for sys_dict_type.AdsIds__fk
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setAdsidsFk(String adsidsFk) {
		this.adsidsFk = adsidsFk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.CreateBy
	 * @return  the value of sys_dict_type.CreateBy
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public Integer getCreateby() {
		return createby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.CreateBy
	 * @param createby  the value for sys_dict_type.CreateBy
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setCreateby(Integer createby) {
		this.createby = createby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.CreateTime
	 * @return  the value of sys_dict_type.CreateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.CreateTime
	 * @param createtime  the value for sys_dict_type.CreateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_type.UpdateTime
	 * @return  the value of sys_dict_type.UpdateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_type.UpdateTime
	 * @param updatetime  the value for sys_dict_type.UpdateTime
	 * @mbg.generated  Thu Apr 06 15:25:15 CST 2017
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5088531147857086489L;
}