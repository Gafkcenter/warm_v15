package com.gafker.manage.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "coffee")
public class Coffee {
	String userName;
	int quanlity;
	
	public int getQuanlity() {
		return quanlity;
	}
	@XmlElement
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Coffee(String userName, int quanlity) {
		super();
		this.userName = userName;
		this.quanlity = quanlity;
	}
	public Coffee() {
	}
}
