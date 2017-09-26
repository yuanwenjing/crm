package com.tjetc.app.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tjetc.app.dao.UserDao;
import com.tjetc.app.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		return true;
	}

}
