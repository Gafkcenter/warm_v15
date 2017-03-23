package com.gafker.manage.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.IUserDao;
import com.gafker.manage.pojo.User;
import com.gafker.manage.service.IUserService;



@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {		
		return this.userDao.findById(userId);
	}

}
