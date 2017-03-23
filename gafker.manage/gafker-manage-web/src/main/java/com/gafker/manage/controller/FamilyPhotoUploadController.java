package com.gafker.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gafker.manage.pojo.Familyphoto;
import com.gafker.manage.pojo.file.UploadedFile;
import com.gafker.manage.pojo.form.FamilyphotoForm;
import com.gafker.manage.service.FileService;
import com.gafker.manage.service.utils.FileUtils;

@Controller
@RequestMapping(value = "f")
public class FamilyPhotoUploadController{
	private static final Logger logger1 = LogManager.getLogger(FamilyPhotoUploadController.class);

	@Autowired
	FileService fileService;
	@RequestMapping(value = "s", method = RequestMethod.GET)
	public String inputProduct() {
		return "file/html5Form";
	}

	@RequestMapping(value = "s", method = RequestMethod.POST,produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String inputProductSave(HttpServletRequest request, @ModelAttribute UploadedFile uploadedfile, BindingResult b) throws Exception {
		if(b.hasErrors()||!FileUtils.isImage(uploadedfile.getMultipartFile().getOriginalFilename())){
			return null;
		}
		String imagePath = fileService.saveFile(uploadedfile,request);
		return imagePath;
	}
	
	@RequestMapping(value = "l/{userId}", method = RequestMethod.GET)
	public String photoListByUserId(@PathVariable Long userId,HttpServletRequest request,Model m) throws Exception{
		FamilyphotoForm c=new FamilyphotoForm();
		c.setId(userId);
		List<FamilyphotoForm> photoList = fileService.listByCondition(c);
		m.addAttribute("photoList", photoList);
		return "file/photoList";
	}
	@RequestMapping(value = "l", method = RequestMethod.GET)
	public String photoList(Familyphoto p,HttpServletRequest request,Model m) throws Exception{
		List<Familyphoto> photoList = fileService.showAllPhoto(p);
		m.addAttribute("photoList", photoList);
		return "file/photoList";
	}
	
}
