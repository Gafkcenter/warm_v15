package com.gafker.manage.service;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.SysDictType;
import com.gafker.manage.pojo.SysDictQuery;
import com.gafker.manage.service.base.BaseService1;

public interface SysDictTypeService extends BaseService1<SysDictType, Page, SysDictQuery, SysDictType> {
	public String getDictId(String namecn) throws Exception;
	public String getDictName(String id) throws Exception;
	void setDictTypeData() throws Exception;
}
