package com.gafker.manage.pojo.request;

import com.gafker.manage.pojo.Happayteachersdays;

public class HappayteachersdaysRequest extends Happayteachersdays {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1055179922797669962L;
	private String warmfile;
	private String requestUri;
	private  double startMiniSecond;
	private  double endMiniSecond;
	private long user;
	private long friend;
	private int isStudents;//0学生1老师
	
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	public double getStartMiniSecond() {
		return startMiniSecond;
	}
	public void setStartMiniSecond(double startMiniSecond) {
		this.startMiniSecond = startMiniSecond;
	}
	public double getEndMiniSecond() {
		return endMiniSecond;
	}
	public void setEndMiniSecond(double endMiniSecond) {
		this.endMiniSecond = endMiniSecond;
	}
	public long getUser() {
		return user;
	}
	public void setUser(long user) {
		this.user = user;
	}
	public long getFriend() {
		return friend;
	}
	public void setFriend(long friend) {
		this.friend = friend;
	}
	
	@Override
	public String toString() {
		return "HappayteachersdaysRequest [requestUri=" + requestUri + ", startMiniSecond=" + startMiniSecond
				+ ", endMiniSecond=" + endMiniSecond + ", user=" + user + ", friend=" + friend + "]";
	}
	public String getWarmfile() {
		return warmfile;
	}
	public void setWarmfile(String warmfile) {
		this.warmfile = warmfile;
	}
	public int getIsStudents() {
		return isStudents;
	}
	public void setIsStudents(int isStudents) {
		this.isStudents = isStudents;
	}
	
}
