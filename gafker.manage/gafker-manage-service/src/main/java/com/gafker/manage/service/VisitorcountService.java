package com.gafker.manage.service;

import com.gafker.manage.pojo.Visitorcount;
import com.gafker.manage.pojo.VisitorcountExample;
import com.gafker.manage.pojo.page.Page;

public interface VisitorcountService extends BaseService<Visitorcount, Page, VisitorcountExample, Visitorcount>{
	public Long getVisitorCount() throws Exception;
	public int saveOrUpdate(Visitorcount c) throws Exception;
}
