package com.gafker.manage.enums;

/**
 * 任务状态
 * 
 * @author gafker
 *
 */
public enum CalendarLevel {
	MEMBER(0, "家庭成员"), FAMILY(1, "家庭"), GENERATION(2, "一代"), BRANCH(3, "姓氏分支"), SURNAME(4, "姓氏"), AREA(5,
			"区域"), KINSFOLK(6, "亲戚"), PUBLIC(6, "大众");
	private int value;
	private String name;

	private CalendarLevel(int value, String name) {
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
