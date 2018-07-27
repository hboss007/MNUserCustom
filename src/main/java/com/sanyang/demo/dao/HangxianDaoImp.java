package com.sanyang.demo.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanyang.demo.vo.VHangxianInfo;

@Repository("dao")

public class HangxianDaoImp extends SqlSessionDaoSupport implements IHangxianDao {

	@Override
	public List<VHangxianInfo> queryHx() {
		return getSqlSession().selectList("com.sanyang.demo.mapper.HangxianMapper.queryhx");
	}

	@Transactional(readOnly=true)
	@Override
	public void saveadd(VHangxianInfo hx) {
		
		getSqlSession().insert("com.sanyang.demo.mapper.HangxianMapper.saveadd",hx);
		System.out.println(">>>>"+hx.getHxid());
	}

	@Override
	public VHangxianInfo queryHxById(Integer hxid) {
		return getSqlSession().selectOne("com.sanyang.demo.mapper.HangxianMapper.queryById",hxid);
	}


}
