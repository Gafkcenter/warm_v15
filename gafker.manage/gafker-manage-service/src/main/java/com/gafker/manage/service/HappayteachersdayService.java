package com.gafker.manage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.gafker.manage.entity.Happayteachersdays;
import com.gafker.manage.entity.HappayteachersdaysExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.pojo.HappayteachersdaysRequest;

public interface HappayteachersdayService {

	public <MultipartFile> int saveInfo(HappayteachersdaysRequest record,HttpServletRequest req,HttpServletResponse res,MultipartFile files)throws Exception;

	public int updateInfo(HappayteachersdaysRequest record)throws Exception;

	public List<Happayteachersdays> listTop20()throws Exception;
	public List<Happayteachersdays> listPage(Page page)throws Exception;

	public List<Happayteachersdays> listTop20Example(Long id,HappayteachersdaysExample example,HappayteachersdaysRequest recordRequest)throws Exception;
}
