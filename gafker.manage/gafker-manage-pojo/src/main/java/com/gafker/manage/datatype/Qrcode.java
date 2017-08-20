package com.gafker.manage.datatype;

import java.io.Serializable;

public class Qrcode implements Serializable {

	/**
	 * qrCodeImage 二维码图片 qrCodeUri 二维码功能地址 description 描述
	 */
	private static final long serialVersionUID = 4621372691761056046L;
	private String qrCodeImage;
	private String qrCodeUri;
	private String description;

	public Qrcode() {
	}

	public Qrcode(String qrCodeImage, String qrCodeUri) {
		this.qrCodeImage = qrCodeImage;
		this.qrCodeUri = qrCodeUri;
	}

	public Qrcode(String qrCodeImage, String qrCodeUri, String description) {
		this.qrCodeImage = qrCodeImage;
		this.qrCodeUri = qrCodeUri;
		this.description = description;
	}

	public String getQrCodeImage() {
		return qrCodeImage;
	}

	public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}

	public String getQrCodeUri() {
		return qrCodeUri;
	}

	public void setQrCodeUri(String qrCodeUri) {
		this.qrCodeUri = qrCodeUri;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
