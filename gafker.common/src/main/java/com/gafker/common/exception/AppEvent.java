package com.gafker.common.exception;

public class AppEvent {

	Long exCode;
	String exMessage;
	public Long getExCode() {
		return exCode;
	}
	public void setExCode(Long exCode) {
		this.exCode = exCode;
	}
	public String getExMessage() {
		return exMessage;
	}
	public void setExMessage(String exMessage) {
		this.exMessage = exMessage;
	}
	
	public AppEvent(Long exCode, String exMessage) {
		super();
		this.exCode = exCode;
		this.exMessage = exMessage;
	}
	@Override
	public String toString() {
		return "exCode:" + exCode + ", exMessage=" + exMessage;
	}
	
	
}
