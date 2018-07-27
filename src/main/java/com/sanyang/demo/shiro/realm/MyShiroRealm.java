package com.sanyang.demo.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

import com.sanyang.demo.vo.UserInfo;

public class MyShiroRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {
		System.out.println("进行用户令牌值设置！~");
		UsernamePasswordToken token = (UsernamePasswordToken)at;
		String username =  token.getUsername();
		if(username!=null&&!username.equals("")){
			UserInfo  ui = null;
			if(username.equals("admin")){
				 ui = new UserInfo("admin", "admin");
			}
			if(ui==null){
				System.out.println("当前用户不存在");
			}else{
				Object unm = ui.getUname();
				Object psd = ui.getPasd();
				return new SimpleAuthenticationInfo(unm, psd, getName());
			}
		}
		return null;
	}

	
}
