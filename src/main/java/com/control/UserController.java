package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;
import com.service.UserLoginandRegister;


@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
private UserLoginandRegister userLoginandRegister;
@RequestMapping("/getlogin")
/*
 * 用户登录，如果登录失败返回登陆页面，成功进入项目主页
 */
public String login(Model model,User user) {
	int userLogin = userLoginandRegister.userLogin(user);
	System.out.println(userLogin);
	if(userLogin>0) {
		return "index";
	}
	else {
     return "login";
	
}
}
//登录界面
@RequestMapping("/login")
public String login() {
	System.out.println("进入login的控制器");
	return "login";
}
/*
 * 显示注册界面
 */
@RequestMapping("/Register")
public String showRegister() {
	System.out.println("xi");
	return "register";
	
}
/*
 * 用户注册
 */
@RequestMapping("/register")
public String register(Model model,User user) {
	System.out.println(user.getPassword()+"000000000");
	userLoginandRegister.insertUser(user);
	return "login";	
}
}
