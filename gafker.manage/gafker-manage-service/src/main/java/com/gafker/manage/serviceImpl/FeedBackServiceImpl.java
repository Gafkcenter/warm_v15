package com.gafker.manage.serviceImpl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.FeedbackMapper;
import com.gafker.manage.pojo.Feedback;
import com.gafker.manage.service.FeedBackService;

@Service("feedBackService")
@Transactional
public class FeedBackServiceImpl implements FeedBackService {

	@Resource
	private FeedbackMapper feedbackMapper;

	public int saveInfo(Feedback record) {
		record.setCreatetime(new Date());
		record.setIsshow(1);
		Long id = record.getId();
		int number;
		if(id != null && id>0 ){
			number = this.updateInfo(record);
		}else{
			number = feedbackMapper.insertSelective(record);
		}
		return number;
	}

	public int updateInfo(Feedback record) {
		record = feedbackMapper.selectByPrimaryKey(record.getId());
		record.setUpdatetime(new Date());
		return feedbackMapper.updateByPrimaryKey(record);
	}

}
