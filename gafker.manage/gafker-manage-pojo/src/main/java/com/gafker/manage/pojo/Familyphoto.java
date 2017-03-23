package com.gafker.manage.pojo;

import java.io.Serializable;
import java.util.Date;

public class Familyphoto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6813815559825979643L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.id
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.NameEn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String nameen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.NameCn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String namecn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.rawName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String rawname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.fileName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String filename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.catelog
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Integer catelog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.uploadTime
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Date uploadtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.uploadUser
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Long uploaduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.star
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Long star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.point
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Long point;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.Idx
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Integer idx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.WebUrls
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String weburls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.AdsIds_fk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private String adsidsFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column familyphoto.commentFk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    private Long commentfk;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.id
     *
     * @return the value of familyphoto.id
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.id
     *
     * @param id the value for familyphoto.id
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.NameEn
     *
     * @return the value of familyphoto.NameEn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getNameen() {
        return nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.NameEn
     *
     * @param nameen the value for familyphoto.NameEn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.NameCn
     *
     * @return the value of familyphoto.NameCn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.NameCn
     *
     * @param namecn the value for familyphoto.NameCn
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.rawName
     *
     * @return the value of familyphoto.rawName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getRawname() {
        return rawname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.rawName
     *
     * @param rawname the value for familyphoto.rawName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setRawname(String rawname) {
        this.rawname = rawname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.fileName
     *
     * @return the value of familyphoto.fileName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.fileName
     *
     * @param filename the value for familyphoto.fileName
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.catelog
     *
     * @return the value of familyphoto.catelog
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Integer getCatelog() {
        return catelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.catelog
     *
     * @param catelog the value for familyphoto.catelog
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setCatelog(Integer catelog) {
        this.catelog = catelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.uploadTime
     *
     * @return the value of familyphoto.uploadTime
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.uploadTime
     *
     * @param uploadtime the value for familyphoto.uploadTime
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.uploadUser
     *
     * @return the value of familyphoto.uploadUser
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Long getUploaduser() {
        return uploaduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.uploadUser
     *
     * @param uploaduser the value for familyphoto.uploadUser
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setUploaduser(Long uploaduser) {
        this.uploaduser = uploaduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.star
     *
     * @return the value of familyphoto.star
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Long getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.star
     *
     * @param star the value for familyphoto.star
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setStar(Long star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.point
     *
     * @return the value of familyphoto.point
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Long getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.point
     *
     * @param point the value for familyphoto.point
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.Idx
     *
     * @return the value of familyphoto.Idx
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.Idx
     *
     * @param idx the value for familyphoto.Idx
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.WebUrls
     *
     * @return the value of familyphoto.WebUrls
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getWeburls() {
        return weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.WebUrls
     *
     * @param weburls the value for familyphoto.WebUrls
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setWeburls(String weburls) {
        this.weburls = weburls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.AdsIds_fk
     *
     * @return the value of familyphoto.AdsIds_fk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public String getAdsidsFk() {
        return adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.AdsIds_fk
     *
     * @param adsidsFk the value for familyphoto.AdsIds_fk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setAdsidsFk(String adsidsFk) {
        this.adsidsFk = adsidsFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column familyphoto.commentFk
     *
     * @return the value of familyphoto.commentFk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public Long getCommentfk() {
        return commentfk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column familyphoto.commentFk
     *
     * @param commentfk the value for familyphoto.commentFk
     *
     * @mbggenerated Sat Mar 11 21:42:03 CST 2017
     */
    public void setCommentfk(Long commentfk) {
        this.commentfk = commentfk;
    }
}