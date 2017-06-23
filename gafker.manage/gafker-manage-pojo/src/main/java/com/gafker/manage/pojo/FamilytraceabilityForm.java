package com.gafker.manage.pojo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.entity.Familytraceability;

public class FamilytraceabilityForm extends Familytraceability{
/**
	 * 
	 */
	private static final long serialVersionUID = 1363817303854599932L;
	
	
	private String productName;
	
private List<MultipartFile> images = new ArrayList<MultipartFile>();

public List<MultipartFile> getImages() {
	return images;
}

public void setImages(List<MultipartFile> images) {
	this.images = images;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

}
