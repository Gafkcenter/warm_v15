package com.gafker.manage.entity;

import java.io.Serializable;

/**
 * 安客诚实时短信发送参数
 * 
 * @ClassName: Acxiom
 */
public class Acxiom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7778793062016856058L;

	private String vender;

	private String signature;

	private Integer type;

	private String mobile;

	private String content;

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	public String getSignature() throws Exception {
		signature = this.mobile + this.type + this.content;
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
