package com.gafker.manage.enums;

public enum DelFlag {
	NORMAL(0, "正常数据"), DELETE(1, "删除");

	private DelFlag(int value, String name) {
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
