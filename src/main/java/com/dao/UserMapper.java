package com.dao;

import org.springframework.stereotype.Repository;

import com.pojo.User;
@Repository
public interface UserMapper {
	public void insertUser(User user);
	public int userLogin(User user);

}
