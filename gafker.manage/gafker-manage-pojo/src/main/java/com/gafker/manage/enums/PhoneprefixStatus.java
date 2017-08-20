package com.gafker.manage.enums;

public enum PhoneprefixStatus {
	OPEN("open"), CLOSE("close");
	private String value;

	private PhoneprefixStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
