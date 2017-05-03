package com.gafker.manage.pojo;

import java.io.Serializable;
import java.util.Date;

public class Phonecvfpath implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5718316957558739601L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String nameen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String namecn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.CvfName
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String cvfname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.Star
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.UseCount
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long usecount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Integer idx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String weburls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String adsidsFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.PhoneSeven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long phonesevenFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Long createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phonecvfpath.Remarks
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.id
     *
     * @return the value of phonecvfpath.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.id
     *
     * @param id the value for phonecvfpath.id
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.NameEn
     *
     * @return the value of phonecvfpath.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getNameen() {
        return nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.NameEn
     *
     * @param nameen the value for phonecvfpath.NameEn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.NameCn
     *
     * @return the value of phonecvfpath.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.NameCn
     *
     * @param namecn the value for phonecvfpath.NameCn
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.CvfName
     *
     * @return the value of phonecvfpath.CvfName
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getCvfname() {
        return cvfname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.CvfName
     *
     * @param cvfname the value for phonecvfpath.CvfName
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setCvfname(String cvfname) {
        this.cvfname = cvfname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.Star
     *
     * @return the value of phonecvfpath.Star
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.Star
     *
     * @param star the value for phonecvfpath.Star
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setStar(Long star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.UseCount
     *
     * @return the value of phonecvfpath.UseCount
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getUsecount() {
        return usecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.UseCount
     *
     * @param usecount the value for phonecvfpath.UseCount
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setUsecount(Long usecount) {
        this.usecount = usecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.Idx
     *
     * @return the value of phonecvfpath.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.Idx
     *
     * @param idx the value for phonecvfpath.Idx
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.WebUrls
     *
     * @return the value of phonecvfpath.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getWeburls() {
        return weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.WebUrls
     *
     * @param weburls the value for phonecvfpath.WebUrls
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setWeburls(String weburls) {
        this.weburls = weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.AdsIds_fk
     *
     * @return the value of phonecvfpath.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getAdsidsFk() {
        return adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.AdsIds_fk
     *
     * @param adsidsFk the value for phonecvfpath.AdsIds_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setAdsidsFk(String adsidsFk) {
        this.adsidsFk = adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.PhoneSeven_fk
     *
     * @return the value of phonecvfpath.PhoneSeven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getPhonesevenFk() {
        return phonesevenFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.PhoneSeven_fk
     *
     * @param phonesevenFk the value for phonecvfpath.PhoneSeven_fk
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setPhonesevenFk(Long phonesevenFk) {
        this.phonesevenFk = phonesevenFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.CreateBy
     *
     * @return the value of phonecvfpath.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Long getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.CreateBy
     *
     * @param createby the value for phonecvfpath.CreateBy
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.CreateTime
     *
     * @return the value of phonecvfpath.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.CreateTime
     *
     * @param createtime the value for phonecvfpath.CreateTime
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phonecvfpath.Remarks
     *
     * @return the value of phonecvfpath.Remarks
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phonecvfpath.Remarks
     *
     * @param remarks the value for phonecvfpath.Remarks
     *
     * @mbg.generated Sun Apr 23 14:36:06 CST 2017
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}