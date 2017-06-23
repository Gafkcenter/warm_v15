package com.gafker.manage.enums;

public enum RecordStatus {
	SHOW(0, "显示"), HIDDEN(1, "隐藏");

	private RecordStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	private int value;
	private String name;

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
