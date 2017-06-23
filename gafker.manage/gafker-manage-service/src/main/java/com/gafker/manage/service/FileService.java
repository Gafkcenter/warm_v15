package com.gafker.manage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gafker.manage.entity.Familyphoto;
import com.gafker.manage.entity.Page;
import com.gafker.manage.pojo.FamilyphotoForm;
import com.gafker.manage.pojo.UploadedFile;
import com.gafker.manage.service.base.BaseService1;

public interface FileService extends BaseService1<FamilyphotoForm, Page, FamilyphotoForm, FamilyphotoForm>{
	public String saveFile(UploadedFile m, HttpServletRequest req) throws Exception;

	public List<Familyphoto> showAllPhoto(Familyphoto p) throws Exception;
}
