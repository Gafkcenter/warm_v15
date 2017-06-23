package com.gafker.manage.enums;
/**
 * 任务分类
 * @author gafker
 *
 */
public enum Catelog {
	WORKTIME(0, "工作"), STUDY(1, "学习"), FAMILY(2, "家庭"), FRIEND(3, "朋友"), COLLEAGUE(4, "同事"), HEALTH(5, "健康");
	private int value;
	private String name;

	private Catelog(int value, String name) {
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
