package com.tjetc.app.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tjetc.app.domain.User;
import com.tjetc.app.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven{
	private User user = new User();
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	//增加用户
	public String add(){
		System.out.println(user);
		userService.add(user);
		return SUCCESS;
	}
	
}
