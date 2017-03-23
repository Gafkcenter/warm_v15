package com.gafker.manage.service.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.pojo.FileResponse;

public class FileUtils {
	public static final Logger logger1 = LogManager.getLogger(FileUtils.class);
	private static final SimpleDateFormat sdf_Short = new SimpleDateFormat("yyyy/");
	private static final SimpleDateFormat sdf_Middle = new SimpleDateFormat("yyyy/MM/");
	private static final SimpleDateFormat sdf_Long = new SimpleDateFormat("yyyy/MM/dd/");


	/**
	 * 
	 * @param request
	 *            获取当前路径没有实际用上
	 * @param file
	 * @param path
	 * @param showPath
	 * @return
	 */
	public static FileResponse saveFile(HttpServletRequest request, MultipartFile file, String path, String showPath) {
		// 判断文件是否为空
		FileResponse response = null;
		if (!file.isEmpty()) {
			String originalFilename = file.getOriginalFilename();
			response = setFileResponse(path, showPath, originalFilename);
			try {
				if (request != null) {
					// 文件保存路径
					String filePath = request.getSession().getServletContext().getRealPath("/") + "fileUpload/"
							+ file.getOriginalFilename();
					if (logger1.isDebugEnabled()) {
						logger1.info("文件保存路径:" + filePath + "转存路径:" + response.getFileUUidFullName());
					}
				} else {
					if (logger1.isDebugEnabled()) {
						logger1.info("转存路径:" + response.getFileUUidFullName());
					}
				}
				// 转存文件
				file.transferTo(new File(response.getFileUUidFullName()));
				return response;
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.setStatus(true);
		}
		return response;
	}

	/**
	 * 
	 * @param path 文件上传的路径
	 * @param showPath 显示给前端的路径
	 * @param originalFilename 上传过来的文件 名
	 * @return
	 */
	public static FileResponse setFileResponse(String path, String showPath, String originalFilename) {
		FileResponse response = new FileResponse();
		response.setFileOriginalFilename(originalFilename);
		String uuidName = getUuidFullName(originalFilename);
		response.setFileUUidFullName(path + uuidName);
		response.setFileUUidName(showPath + uuidName);
		response.setSourceFilePath(path+originalFilename);
		return response;
	}


	/**
	 * 
	 * @param request
	 *            获取当前路径没有实际用上
	 * @param file
	 * @param path
	 * @param showPath
	 * @return
	 */
	public static FileResponse saveFile(MultipartFile file, String path, String showPath) {
		return saveFile(null, file, path, showPath);
	}

	/**
	 * 
	 */
	public static List<FileResponse> saveMoreFile(List<MultipartFile> files, String path, String showPath) {
		// 存放文件名列表
		ArrayList<FileResponse> fileNames = new ArrayList<FileResponse>();
		if (null != files && files.size() > 0) {
			for (MultipartFile file : files) {
				FileResponse fileResponse = saveFile(file, path, showPath);
				fileNames.add(fileResponse);
			}
		}
		return fileNames;

	}
	/**
	 * 根据原文件名获取新的uuid文件名称
	 * @param originalFilename
	 * @return
	 */
	public static String getUuidFullName(String originalFilename) {
		String suffic = originalFilename.substring(originalFilename.lastIndexOf("."));
		String uuidName = getUuidName(suffic);
		return uuidName;
	}
	//创建文件夹并拼成完整带日期的uuid文件名。
	public static String getUuidName(String suffix) {
		String uuidName = UUID.randomUUID().toString().replace("-", "") + suffix;
		String path =getYearMonthDayPath(true);
		File f=new File(path);
		if(!f.exists()){
			f.mkdirs();
		}
		return path+uuidName;
	}

	/**
	 * 
	 * @param boo  null  完整yyyy/MM/dd
	 * 			   true  yyyy/MM
	 * 			   false yyyy
	 * @return
	 */
	public static String getYearMonthDayPath(Boolean boo) {
		Date date = new Date();
		if (null == boo) {
			return sdf_Short.format(date);
		} else if (true == boo) {
			return sdf_Middle.format(date);
		} else {
			return sdf_Long.format(date);
		}
	}
	
	public static Boolean isImage(String filename){
		String reg = ".+(.JPEG|.jpeg|.JPG|.jpg|.GIF|.gif|.BMP|.bmp|.PNG|.png|.webp)$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(filename.toLowerCase());
		return matcher.find();
	}
	
	
	/**
	 * 
	 * @param base64img 编码图片
	 * @param recordRoot 文件存放位置
	 * @return imageName  格式化好的文件名
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String saveBase64Img(String base64img,String recordRoot) throws FileNotFoundException, IOException {
		String[] split = base64img.split(",");//split[0]为文件头，split[1]为图片的内容
		String[] splitHead = split[0].split(";");//split[0]为文件类型头images/jpeg，split[1]base64字样
		String suffix = splitHead[0].substring(splitHead[0].indexOf("/")+1);//取文件类型jpeg
		String base64imgtemp=split[1];
		String imageName = FileUtils.getUuidFullName("warm."+suffix);//传入主要是用后缀前面文件名不起作用
		/**
		 * Base64上传图片
		 */
		Base64 base64 =new Base64();
		if(!base64imgtemp.isEmpty()){
				byte[] byteArray = base64.decode(base64imgtemp);
				for(byte b:byteArray){
					if(b<0)
						b+=256;
				}
				OutputStream out=new FileOutputStream(recordRoot+File.separator+imageName);
				out.write(byteArray);
				out.close();
		}
		return imageName;
	}
}
