package com.sanyang.demo.vo;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class VHangxianInfo {
	  private Integer hxid;// NUMBER not null,
	  @Size(min=1,message="名称不能为空")
	  private String hxmc;// VARCHAR2(50),
	  
	  @Pattern(regexp="[襄阳]+",message="出发城市必须为襄阳")
	  private String qfcs ;//(55),
	  private String ddcs;// VARCHAR2(55),
	  private String cfrq;// DATE,
	  private String cfsj;// VARCHAR2(22)
	  
	public Integer getHxid() {
		return hxid;
	}
	public void setHxid(Integer hxid) {
		this.hxid = hxid;
	}
	public String getHxmc() {
		return hxmc;
	}
	public void setHxmc(String hxmc) {
		this.hxmc = hxmc;
	}
	public String getQfcs() {
		return qfcs;
	}
	public void setQfcs(String qfcs) {
		this.qfcs = qfcs;
	}
	public String getDdcs() {
		return ddcs;
	}
	public void setDdcs(String ddcs) {
		this.ddcs = ddcs;
	}
	public String getCfrq() {
		return cfrq;
	}
	public void setCfrq(String cfrq) {
		this.cfrq = cfrq;
	}
	public String getCfsj() {
		return cfsj;
	}
	public void setCfsj(String cfsj) {
		this.cfsj = cfsj;
	}
	  
	  
}
