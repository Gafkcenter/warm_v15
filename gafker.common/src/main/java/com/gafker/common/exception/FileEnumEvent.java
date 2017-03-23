package com.gafker.common.exception;

public enum FileEnumEvent{
	IMAGEPATH("image not exist!");
	String value;

	private FileEnumEvent(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
