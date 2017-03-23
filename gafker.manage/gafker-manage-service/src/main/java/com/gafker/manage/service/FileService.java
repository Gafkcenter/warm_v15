package com.gafker.manage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gafker.manage.pojo.Familyphoto;
import com.gafker.manage.pojo.file.UploadedFile;
import com.gafker.manage.pojo.form.FamilyphotoForm;
import com.gafker.manage.pojo.page.Page;

public interface FileService extends BaseService<FamilyphotoForm, Page, FamilyphotoForm, FamilyphotoForm>{
	public String saveFile(UploadedFile m, HttpServletRequest req) throws Exception;

	public List<Familyphoto> showAllPhoto(Familyphoto p) throws Exception;
}
