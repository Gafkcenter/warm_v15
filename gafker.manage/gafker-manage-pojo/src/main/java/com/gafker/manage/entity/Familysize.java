package com.gafker.manage.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Familysize implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.id
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.NameEn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String nameen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.NameCn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Size(min = 1, message = "家人名不能为空?")
	private String namecn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.BodyType
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String bodytype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Height
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=50,max=200,message = "身高必须50~200cm")
	private Double height;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Weight
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=3,max=200,message = "体重必须3.5~200kg")
	private Double weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.ShoulderSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=10,max=120,message = "肩宽10~120cm")
	private Double shouldersize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.BustSzie
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=10,max=100,message = "胸围必须10~100cm")
	private Double bustszie;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.WaistSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=10,max=100,message = "腰围必须10~100cm")
	private Double waistsize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Hipline
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=30,max=100,message = "臀宽必须30~100cm")
	private Double hipline;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.ShoesSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	@Range(min=10,max=45,message = "鞋码必须10~45码")
	private String shoessize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.SizeObj
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String sizeobj;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.UserIdFk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Long useridfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Idx
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Integer idx;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.WebUrls
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String weburls;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.AdsIds_fk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String adsidsFk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Status
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.Remarks
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String remarks;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.CreateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Date createtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.CreateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String createby;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.UpdateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private Date updatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column familysize.UpdateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	private String updateby;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.id
	 * @return  the value of familysize.id
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.id
	 * @param id  the value for familysize.id
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.NameEn
	 * @return  the value of familysize.NameEn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getNameen() {
		return nameen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.NameEn
	 * @param nameen  the value for familysize.NameEn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setNameen(String nameen) {
		this.nameen = nameen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.NameCn
	 * @return  the value of familysize.NameCn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getNamecn() {
		return namecn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.NameCn
	 * @param namecn  the value for familysize.NameCn
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setNamecn(String namecn) {
		this.namecn = namecn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.BodyType
	 * @return  the value of familysize.BodyType
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getBodytype() {
		return bodytype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.BodyType
	 * @param bodytype  the value for familysize.BodyType
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Height
	 * @return  the value of familysize.Height
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Height
	 * @param height  the value for familysize.Height
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Weight
	 * @return  the value of familysize.Weight
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Weight
	 * @param weight  the value for familysize.Weight
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.ShoulderSize
	 * @return  the value of familysize.ShoulderSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getShouldersize() {
		return shouldersize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.ShoulderSize
	 * @param shouldersize  the value for familysize.ShoulderSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setShouldersize(Double shouldersize) {
		this.shouldersize = shouldersize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.BustSzie
	 * @return  the value of familysize.BustSzie
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getBustszie() {
		return bustszie;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.BustSzie
	 * @param bustszie  the value for familysize.BustSzie
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setBustszie(Double bustszie) {
		this.bustszie = bustszie;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.WaistSize
	 * @return  the value of familysize.WaistSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getWaistsize() {
		return waistsize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.WaistSize
	 * @param waistsize  the value for familysize.WaistSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setWaistsize(Double waistsize) {
		this.waistsize = waistsize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Hipline
	 * @return  the value of familysize.Hipline
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Double getHipline() {
		return hipline;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Hipline
	 * @param hipline  the value for familysize.Hipline
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setHipline(Double hipline) {
		this.hipline = hipline;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.ShoesSize
	 * @return  the value of familysize.ShoesSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getShoessize() {
		return shoessize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.ShoesSize
	 * @param shoessize  the value for familysize.ShoesSize
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setShoessize(String shoessize) {
		this.shoessize = shoessize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.SizeObj
	 * @return  the value of familysize.SizeObj
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getSizeobj() {
		return sizeobj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.SizeObj
	 * @param sizeobj  the value for familysize.SizeObj
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setSizeobj(String sizeobj) {
		this.sizeobj = sizeobj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.UserIdFk
	 * @return  the value of familysize.UserIdFk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Long getUseridfk() {
		return useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.UserIdFk
	 * @param useridfk  the value for familysize.UserIdFk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setUseridfk(Long useridfk) {
		this.useridfk = useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Idx
	 * @return  the value of familysize.Idx
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Integer getIdx() {
		return idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Idx
	 * @param idx  the value for familysize.Idx
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.WebUrls
	 * @return  the value of familysize.WebUrls
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getWeburls() {
		return weburls;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.WebUrls
	 * @param weburls  the value for familysize.WebUrls
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setWeburls(String weburls) {
		this.weburls = weburls;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.AdsIds_fk
	 * @return  the value of familysize.AdsIds_fk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getAdsidsFk() {
		return adsidsFk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.AdsIds_fk
	 * @param adsidsFk  the value for familysize.AdsIds_fk
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setAdsidsFk(String adsidsFk) {
		this.adsidsFk = adsidsFk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Status
	 * @return  the value of familysize.Status
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Status
	 * @param status  the value for familysize.Status
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.Remarks
	 * @return  the value of familysize.Remarks
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.Remarks
	 * @param remarks  the value for familysize.Remarks
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.CreateTime
	 * @return  the value of familysize.CreateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.CreateTime
	 * @param createtime  the value for familysize.CreateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.CreateBy
	 * @return  the value of familysize.CreateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getCreateby() {
		return createby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.CreateBy
	 * @param createby  the value for familysize.CreateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setCreateby(String createby) {
		this.createby = createby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.UpdateTime
	 * @return  the value of familysize.UpdateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.UpdateTime
	 * @param updatetime  the value for familysize.UpdateTime
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column familysize.UpdateBy
	 * @return  the value of familysize.UpdateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public String getUpdateby() {
		return updateby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column familysize.UpdateBy
	 * @param updateby  the value for familysize.UpdateBy
	 * @mbg.generated  Mon Apr 17 17:15:19 CST 2017
	 */
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5458542654738088302L;
}