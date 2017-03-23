package com.gafker.manage.pojo;

public enum RecordStatus {
	Show(0), Hidden(1);

	private RecordStatus(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
