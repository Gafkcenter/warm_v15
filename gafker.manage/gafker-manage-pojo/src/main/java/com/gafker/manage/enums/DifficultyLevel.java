package com.gafker.manage.enums;

/**
 * 难度级别
 * 
 * @author gafker
 *
 */
public enum DifficultyLevel {
	NORMAL(0, "普通"), VERYHARD(1, "极难"), SPECALHARD(2, "特别难"), HARD(3, "难"), NOTHARD(4, "不难"), SPECALNOTHARD(5, "特别不难");
	private int value;
	private String name;

	private DifficultyLevel(int value, String name) {
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
