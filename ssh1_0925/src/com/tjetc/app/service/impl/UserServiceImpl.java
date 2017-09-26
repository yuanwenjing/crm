package com.tjetc.app.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.tjetc.app.dao.UserDao;
import com.tjetc.app.domain.User;
import com.tjetc.app.service.UserService;
@Transactional
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		return userDao.add(user);
	}

}
