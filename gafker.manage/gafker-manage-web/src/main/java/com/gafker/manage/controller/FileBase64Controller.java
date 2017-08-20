package com.gafker.manage.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.gafker.manage.service.FileBase64Service;
import com.gafker.manage.vo.FileBase64InfoResponse;

@Controller
public class FileBase64Controller {
	
	@Autowired
	FileBase64Service fileBase64Service;
	
	@RequestMapping(value = "upoadImgBase64Canvas",method=RequestMethod.GET)
	public String uploadImgBase64Camvas(Model m){
		return "admin/images/canvas";
	}
	
	/**
	 * 上传一个base64文件
	 * @param base64img
	 * @param request
	 * @return FileBase64InfoResponse
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "upoadImgBase64Canvas",method=RequestMethod.POST)
	public FileBase64InfoResponse uploadImgBase64Canvas(String base64img,HttpServletRequest request)
			throws Exception {
		FileBase64InfoResponse response=fileBase64Service.saveBase64File(base64img);
		return response;
	}
	
	
	
	@RequestMapping(value = "upoadImgBase64",method=RequestMethod.GET)
	public String uploadImgBase64Index(Model m){
		return "admin/images/base64imagesupload";
	}
	
	/**
	 * 没有测试通过
	 * @param baseFile
	 * @param request
	 * @param m
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping(value = "upoadImgBase64",method=RequestMethod.POST)
	public String uploadImgBase64(String[] baseFile, HttpServletRequest request,Model m)
			throws IllegalStateException, IOException {
		/**
		 * Base64上传图片
		 */
		String path = request.getSession().getServletContext().getRealPath("uploadImg");
		Base64 base64 =new Base64();
		String[] imageNames = new String[baseFile.length];
		if(baseFile!=null && baseFile.length!=0){
			int index =0;
			for(String base64Str:baseFile){
				byte[] byteArray = base64.decode(base64Str);
				for(byte b:byteArray){
					if(b<0)
						b+=256;
				}
				String imageName = this.getImageName();
				OutputStream out=new FileOutputStream(path+File.separator+imageName);
				out.write(byteArray);
				out.close();
				imageNames[index]=path+File.separator+imageName;
				index++;
			}
		}
		System.out.println(imageNames[0]);
		m.addAttribute("message", "Success!!!");
		return "success";
	}
	
	/**
	 * 没有测试通过
	 * @param baseFile
	 * @param request
	 * @param m
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping(value = "upoadImgSpringMvc")
	public String uploadImg(String[] baseFile, HttpServletRequest request,Model m)
			throws IllegalStateException, IOException {
		/**
		 * springMvc 上传图片 1.enctype属性的属性值设为multipart/form-data。
		 * 2.input的type属性的属性值设为file。 后台就可以使用multipartResolver获取到前台上传的文件
		 */
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iter = multipartRequest.getFileNames();
			// 上传一张
			// MultipartFile file11 = multipartRequest.getFile("files");
			// 上传多张图片
			while (iter.hasNext()) {
				MultipartFile file = multipartRequest.getFile((String) iter.next());
				if (!file.isEmpty()) {
					String path = request.getSession().getServletContext().getRealPath("uploadImg");
					String imageName = this.getImageName();
					File savefile = new File(path + File.separator + imageName);
					file.transferTo(savefile);
				}
			}
		}
		m.addAttribute("message", "Success!!!");
		return "success";
	}

	/**
	 * 用户自已根据系统规则得到图片的名称
	 * 
	 * @return
	 */
	private String getImageName() {
		return UUID.randomUUID().toString() + ".jpg";
	}
}
