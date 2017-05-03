package com.gafker.manage.pojo.jsonbeantype;

import java.io.Serializable;

public class PhoneMobile  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3103188180559534196L;
	private String id;
	//运营商
	private String operator;
	//淘宝显示运营商名
	private String catName;
	//分支运营商
	private String carrier;
	//前7位
	private String prefix;
	private String mts;
	//完整11位
	private String mobile;
	private String telString;
	//州
	private String state;
	//国
	private String country;
	//省
	private String province;
	//市
	private String city;
	//区,县
	private String district;
	//镇
	private String town;
	//经度
	private Double longitude;
	//纬度
	private Double latitude;
	//地址
	private String address;
	//iteblog状态
	private String ret;
	//360
	private String code;
	private Data360 data;
	private String msg;
	//区号
	private String areaCode;
	private String areaVid;
	private String ispVid;
	//邮编
	private String zip;
	//搜索内容
	private String searchStr;
	//搜索ip
	private String ip;
	//搜索user-agent
	private String ua;
	//网址
	private String from;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUa() {
		return ua;
	}
	public void setUa(String ua) {
		this.ua = ua;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getMts() {
		return mts;
	}
	public void setMts(String mts) {
		this.mts = mts;
	}
	public String getTelString() {
		return telString;
	}
	public void setTelString(String telString) {
		this.telString = telString;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Data360 getData() {
		return data;
	}
	public void setData(Data360 data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAreaVid() {
		return areaVid;
	}
	public void setAreaVid(String areaVid) {
		this.areaVid = areaVid;
	}
	public String getIspVid() {
		return ispVid;
	}
	public void setIspVid(String ispVid) {
		this.ispVid = ispVid;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
