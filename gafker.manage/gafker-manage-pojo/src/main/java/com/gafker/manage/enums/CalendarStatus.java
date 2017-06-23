package com.gafker.manage.enums;

/**
 * 任务状态
 * 
 * @author gafker
 *
 */
public enum CalendarStatus {
	NOTSTART(0, "未开始"), PLANING(1, "计划中"), RUNNING(2, "进行中"), WAITING(3, "等待中"), ENCOUNTER(4, "遇到团难"), STOP(5,
			"中止"), FINISHED(6, "完成");
	private int value;
	private String name;

	private CalendarStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
