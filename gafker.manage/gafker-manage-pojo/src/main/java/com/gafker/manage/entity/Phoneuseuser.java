package com.gafker.manage.entity;

import java.io.Serializable;
import java.util.Date;

public class Phoneuseuser implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2739428848808109982L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String nameen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String namecn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.phone_seven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long phoneSevenFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Integer idx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String weburls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String adsidsFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phoneuseuser.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.id
     *
     * @return the value of phoneuseuser.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.id
     *
     * @param id the value for phoneuseuser.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.NameEn
     *
     * @return the value of phoneuseuser.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getNameen() {
        return nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.NameEn
     *
     * @param nameen the value for phoneuseuser.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.NameCn
     *
     * @return the value of phoneuseuser.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.NameCn
     *
     * @param namecn the value for phoneuseuser.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.phone_seven_fk
     *
     * @return the value of phoneuseuser.phone_seven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getPhoneSevenFk() {
        return phoneSevenFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.phone_seven_fk
     *
     * @param phoneSevenFk the value for phoneuseuser.phone_seven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setPhoneSevenFk(Long phoneSevenFk) {
        this.phoneSevenFk = phoneSevenFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.Idx
     *
     * @return the value of phoneuseuser.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.Idx
     *
     * @param idx the value for phoneuseuser.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.WebUrls
     *
     * @return the value of phoneuseuser.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getWeburls() {
        return weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.WebUrls
     *
     * @param weburls the value for phoneuseuser.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setWeburls(String weburls) {
        this.weburls = weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.AdsIds_fk
     *
     * @return the value of phoneuseuser.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getAdsidsFk() {
        return adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.AdsIds_fk
     *
     * @param adsidsFk the value for phoneuseuser.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setAdsidsFk(String adsidsFk) {
        this.adsidsFk = adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.CreateBy
     *
     * @return the value of phoneuseuser.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.CreateBy
     *
     * @param createby the value for phoneuseuser.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phoneuseuser.CreateTime
     *
     * @return the value of phoneuseuser.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phoneuseuser.CreateTime
     *
     * @param createtime the value for phoneuseuser.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}