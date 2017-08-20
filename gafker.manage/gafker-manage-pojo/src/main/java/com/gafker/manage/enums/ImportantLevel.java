package com.gafker.manage.enums;

/**
 * 重要级别
 * 
 * @author gafker
 *
 */
public enum ImportantLevel {
	NORMAL(0, "普通"), VERYIMPORTANT(1, "首级重要"), SPECALIMPORTANT(2, "特别重要"), IMPORTANT(3, "重要"), NOTIMPORTANT(4,
			"不重要"), SPECALNOIMPORTANT(5, "特别不重要");
	private int value;
	private String name;

	private ImportantLevel(int value, String name) {
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
