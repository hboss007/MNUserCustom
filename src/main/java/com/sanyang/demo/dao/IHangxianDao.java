package com.sanyang.demo.dao;

import java.util.List;

import com.sanyang.demo.vo.VHangxianInfo;

public interface IHangxianDao {

	public List<VHangxianInfo> queryHx();

	public void saveadd(VHangxianInfo hx);

	public VHangxianInfo queryHxById(Integer hxid);

}