package com.gafker.manage.pojo.file;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UploadedFile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8510167454120352308L;
	
	private MultipartFile multipartFile;
	

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
}
