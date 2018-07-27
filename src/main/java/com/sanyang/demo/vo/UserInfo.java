package com.sanyang.demo.vo;

public class UserInfo {
	private String uname;
	private String pasd;
	
	public UserInfo(){}
	
	public UserInfo(String uname, String pasd) {
		this.uname = uname;
		this.pasd = pasd;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasd() {
		return pasd;
	}
	public void setPasd(String pasd) {
		this.pasd = pasd;
	}
	
	

}
