package com.gafker.manage.service;

import com.gafker.manage.pojo.SysDictType;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.query.SysDictQuery;
import com.gafker.manage.service.base.BaseService1;

public interface SysDictTypeService extends BaseService1<SysDictType, Page, SysDictQuery, SysDictType> {
	public String getDictId(String namecn) throws Exception;
	public String getDictName(String id) throws Exception;
	void setDictTypeData() throws Exception;
}
