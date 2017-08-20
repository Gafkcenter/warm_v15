package com.gafker.manage.enums;

/**
 * 时间周期
 * 
 * @author gafker
 *
 */
public enum WarningCycle {
	DAY(0, "天"), WEEK(1, "周"), MONTH(2, "月"), QUARTER(3, "季度"), YEAR(4, "年度"), HOUR(5, "小时"), MINUTES(6, "分钟");
	private int value;
	private String name;

	private WarningCycle(int value, String name) {
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
