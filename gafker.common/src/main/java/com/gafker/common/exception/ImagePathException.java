package com.gafker.common.exception;

import com.gafker.common.utils.FileEnumEvent;

public class ImagePathException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6024832588157414747L;
	private FileEnumEvent errors;
	private String stringMessage;
	public FileEnumEvent getErrors() {
		return errors;
	}
	public void setErrors(FileEnumEvent errors) {
		this.errors = errors;
	}
	public ImagePathException(FileEnumEvent errors) {
		super();
		this.errors = errors;
	}
	
	public ImagePathException(FileEnumEvent errors, String stringMessage) {
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
