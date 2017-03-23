package com.gafker.manage.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.page.Page;

public interface UserAttributeService extends  BaseService<Userattribute, Page, Userattribute, Userattribute>{
	public int saveInfo( Userattribute user,HttpServletRequest req,HttpServletResponse res,MultipartFile files)throws Exception;
	public int qrcodeInfo( Userattribute user,HttpServletRequest req,HttpServletResponse res,MultipartFile files)throws Exception;
	public Userattribute selectByPrimaryKey(Long id)throws Exception;
	public void updateUserShareTimes(Userattribute user)throws Exception;
	public boolean isUserExist(String username)throws Exception;
}
