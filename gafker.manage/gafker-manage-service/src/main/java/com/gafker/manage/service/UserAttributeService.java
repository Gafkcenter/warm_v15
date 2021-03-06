package com.gafker.manage.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Userattribute;
import com.gafker.manage.service.base.BaseService1;

public interface UserAttributeService extends  BaseService1<Userattribute, Page, Userattribute, Userattribute>{
	public <MultipartFile> int saveInfo( Userattribute user,HttpServletRequest req,HttpServletResponse res,MultipartFile files)throws Exception;
	public <MultipartFile> int qrcodeInfo( Userattribute user,HttpServletRequest req,HttpServletResponse res,MultipartFile files)throws Exception;
	public Userattribute selectByPrimaryKey(Long id)throws Exception;
	public void updateUserShareTimes(Userattribute user)throws Exception;
	public boolean isUserExist(String username)throws Exception;
	public Userattribute setUserContactPhone(Long id)throws Exception;
	
}
