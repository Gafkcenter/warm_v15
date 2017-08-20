package com.gafker.manage.enums;

/**
 * 完成速度
 * 
 * @author gafker
 *
 */
public enum SpeedProgress {
	NORMAL(0, "刚好"), VERYFAST(1, "极快"), SPECALFAST(2, "特别快"), FAST(3, "快"), SLOW(4,
			"慢"), SPECALSLOW(5, "特别慢"),VERYSLOW(6, "极慢");
	private int value;
	private String name;

	private SpeedProgress(int value, String name) {
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
