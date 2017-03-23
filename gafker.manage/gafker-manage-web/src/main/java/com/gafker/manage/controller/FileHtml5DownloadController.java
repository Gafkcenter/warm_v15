package com.gafker.manage.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "f")
public class FileHtml5DownloadController {
	private static final Logger logger = Logger.getLogger(FileHtml5DownloadController.class);

	@RequestMapping(value = "/d",method=RequestMethod.GET)
	public String downloadRequest(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		if (session == null || session.getAttribute("user") == null) {
			return "redirect:/security/login";
		}
		String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/data");
		File file = new File(dataDirectory, "JSonUtils.java");
		if (file.exists()) {
			response.setContentType("application/txt");
			response.addHeader("Content-Disposition", "attachment; filename=JSonUtils.java");
			byte[] buffer = new byte[1024];
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				ServletOutputStream os = response.getOutputStream();
				int i = bis.read(buffer);
				while (i != -1) {
					os.write(buffer, 0, i);
					i = bis.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (bis != null) {
					try {
						bis.close();
					} catch (IOException e) {
					}
				}
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
					}
				}
			}
		}
		return null;
	}
}
