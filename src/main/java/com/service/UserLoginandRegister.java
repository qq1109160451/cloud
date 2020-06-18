package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.pojo.User;

@Service
public class UserLoginandRegister {
	@Autowired
	//@Qualifier("usermapper")
	private UserMapper usermapper;
	public void insertUser(User user) {
		System.out.println("用户名"+user.getUserName());
		usermapper.insertUser(user);
	}
	public int userLogin(User user) {
		System.out.println(user.getUserName()+"-----"+user.getPassword());
		System.out.println(usermapper.userLogin(user));
		return usermapper.userLogin(user);
	}
}