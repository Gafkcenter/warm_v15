package com.gafker.manage.enums;

public enum CommonType {
	STAR(0, "任务点赞评估统计"), ASSIGNED(1, "任务指派的对应Id");
	private int value;
	private String name;

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	private CommonType(int value, String name) {
		this.value = value;
		this.name = name;
	}

}
