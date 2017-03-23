package com.gafker.common.exception;


public class DestImagePathException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8677432244685530221L;
	private FileEnumEvent errors;
	private String stringMessage;
	public FileEnumEvent getErrors() {
		return errors;
	}
	public void setErrors(FileEnumEvent errors) {
		this.errors = errors;
	}
	public DestImagePathException(FileEnumEvent errors) {
		super();
		this.errors = errors;
	}
	
	public DestImagePathException(FileEnumEvent errors, String stringMessage) {
		super();
		this.errors = errors;
		this.stringMessage = stringMessage;
	}
	public String getStringMessage() {
		return stringMessage;
	}
	public void setStringMessage(String stringMessage) {
		this.stringMessage = stringMessage;
	}
}
