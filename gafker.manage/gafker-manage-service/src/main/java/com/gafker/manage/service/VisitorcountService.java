package com.gafker.manage.service;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Visitorcount;
import com.gafker.manage.entity.VisitorcountExample;
import com.gafker.manage.service.base.BaseService1;

public interface VisitorcountService extends BaseService1<Visitorcount, Page, VisitorcountExample, Visitorcount>{
	public Long getVisitorCount() throws Exception;
	public int saveOrUpdate(Visitorcount c) throws Exception;
}
