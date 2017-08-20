package com.gafker.manage.datatype;

import java.io.Serializable;

public class Data360 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5812197142897242490L;
	private String province;
	private String city;
	// 运营商
	private String sp;
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
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
}
