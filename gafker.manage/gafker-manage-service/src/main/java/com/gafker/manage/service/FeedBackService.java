package com.gafker.manage.service;

import com.gafker.manage.pojo.Feedback;

public interface FeedBackService {

	public int saveInfo(Feedback record);

	public int updateInfo(Feedback record);
}
