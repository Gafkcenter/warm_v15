package com.gafker.manage.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.gafker.manage.pojo.Coffee;
import com.gafker.manage.pojo.User;

/**
 * 
 * @author gafker
 *
 */
@RestController
public class AjaxController {
	String uploadPath = "D:\\fileUpload\\2017\\clientupload\\";

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String getLogin(HttpServletRequest request, HttpServletResponse response, User user) {
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		return user.getUserName();
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public List<User> getInfo(HttpServletRequest request, HttpServletResponse response, User user) {
		List<User> data = new ArrayList<User>();
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		data.add(user);
		return data;
	}

	@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
	public User getUser(HttpServletRequest request, HttpServletResponse response, User user) {
		if (user.getUserName() == null && "" != user.getUserName()) {
			user.setUserName("Guest");
		}
		return user;
	}

	@RequestMapping(value = "/xml", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody Coffee getXml(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Coffee coffee = new Coffee("Gafker", 100);
		return coffee;
	}

	@RequestMapping(value = "/listxml", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody List<Coffee> getListXml(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		List<Coffee> cofList = new ArrayList<Coffee>();
		for (int i = 0; i <= 100; i++) {
			Coffee coffee = new Coffee();
			coffee.setQuanlity(i);
			coffee.setUserName("G" + i);
			cofList.add(coffee);
		}
		return cofList;
	}

	@RequestMapping("springUpload")
	public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();
			Enumeration<String> parameterNames = request.getParameterNames();
			while (parameterNames.hasMoreElements()) {
				String key = parameterNames.nextElement();
				System.out.println(key+"="+request.getParameter(key));
			}
			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String path = uploadPath +Math.random()*100+file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}

	/**
	 * 文件接收不到
	 * 
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "importfileForm", method = { RequestMethod.POST })
	public void processUpload(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		File uploadFile = new File(uploadPath);
		if (!uploadFile.exists()) {
			uploadFile.mkdirs();
		}

		System.out.println("Come on, baby .......");

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		// 检测是不是存在上传文件
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (isMultipart) {
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// 指定在内存中缓存数据大小,单位为byte,这里设为1Mb
			factory.setSizeThreshold(1024 * 1024);

			// 设置一旦文件大小超过getSizeThreshold()的值时数据存放在硬盘的目录
			factory.setRepository(new File("D:\\temp"));

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

			// 指定单个上传文件的最大尺寸,单位:字节，这里设为50Mb
			upload.setFileSizeMax(50 * 1024 * 1024);

			// 指定一次上传多个文件的总尺寸,单位:字节，这里设为50Mb
			upload.setSizeMax(50 * 1024 * 1024);
			upload.setHeaderEncoding("UTF-8");

			List<FileItem> items = null;

			try {
				// 解析request请求
				items = upload.parseRequest(request);
			} catch (FileUploadException e) {
				e.printStackTrace();
			}

			if (items != null) {
				// 解析表单项目
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
					FileItem item = iter.next();

					// 如果是普通表单属性
					if (item.isFormField()) {
						// 相当于input的name属性 <input type="text" name="content">
						String name = item.getFieldName();

						// input的value属性
						String value = item.getString();

						System.out.println("属性:" + name + " 属性值:" + value);
					}
					// 如果是上传文件
					else {
						// 属性名
						String fieldName = item.getFieldName();

						// 上传文件路径
						String fileName = item.getName();
						fileName = fileName.substring(fileName.lastIndexOf("/") + 1);// 获得上传文件的文件名

						try {
							item.write(new File(uploadPath, fileName));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

		response.addHeader("token", "hello");
	}

}
