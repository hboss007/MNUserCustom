package com.sanyang.demo.handler;

import org.apache.shiro.subject.Subject;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.demo.vo.UserInfo;

@Controller
public class UserLoginHandler {

	
	@RequestMapping("/uslogin")
	public String userLogin(String uname,String pasd,HttpServletRequest request){
		System.out.println("进入到登录的方法！~~~");
		Subject currentUser = SecurityUtils.getSubject();
		UserInfo ui;
		if(uname.equals("admin")){
			ui = new UserInfo(uname,pasd);
		}
		
		if(!currentUser.isAuthenticated()){
			UsernamePasswordToken token = new UsernamePasswordToken(uname, pasd);
			token.setRememberMe(true);
			try {
				System.out.println("1."+token.hashCode());
				currentUser.login(token);
				
			} catch (Exception e) {
				System.out.println("登录失败");
			}
		}
		
		return "index";
	}
}
