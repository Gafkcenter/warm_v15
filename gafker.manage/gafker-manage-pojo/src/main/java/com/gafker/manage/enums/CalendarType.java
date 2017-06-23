package com.gafker.manage.enums;

/**
 * 任务种类
 * @author gafker
 *
 */
public enum CalendarType {
	WARM(0, "普通祝福"), BIRTHDAY(1, "生日"),WEDDINGDAY(2, "结婚纪念日"), OTHDAY(3, "其它纪念日"), HOLIDAY(4, "节日假日"), TASK(5, "任务"),
	MEMO(6, "记事备忘"), URLTECH(7, "技术URL"), TECHNOLOGYSTUDY(8, "技术学习"), OTHSTUDY(9, "其它技术文字"),SIXSIGMA(10, "六西格马");
	private int value;
	private String name;

	private CalendarType(int value, String name) {
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
