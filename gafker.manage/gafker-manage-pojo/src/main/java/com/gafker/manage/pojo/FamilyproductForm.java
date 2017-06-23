package com.gafker.manage.pojo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.entity.Familyproduct;

public class FamilyproductForm extends Familyproduct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7539310387721957644L;
	private List<MultipartFile> images;

	public List<MultipartFile> getImages() {
		return images;
	}

	public void setImages(List<MultipartFile> images) {
		this.images = images;
	}

}
