package com.gafker.manage.enums;

public enum PhoneprefixFinished {
	START("Start"),ONGOING("Ongoing"), FINISHED("Finished");
	private String value;

	private PhoneprefixFinished(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
