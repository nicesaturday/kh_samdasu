package com.samdasu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samdasu.dto.Free;

@Repository
public class FreeDAOImpl implements FreeDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int getTotalFreeCount() {
		return sqlSession.selectOne("free.getTotalFreeCount");
	}

	@Override
	public List<Free> getFrees() {
		return sqlSession.selectList("free.getFrees");
	}

	@Override
	public Free getFree(int num) {
		return sqlSession.selectOne("free.getFree" , num);
	}

	@Override
	public void insFree(Free Free) {
		sqlSession.insert("free.insFree", Free );
	}

	@Override
	public void upFree(Free Free) {
		sqlSession.update("free.upFree", Free);
	}

	@Override
	public void upFreeHits(int num) {
		sqlSession.update("free.upFreeHits" , num);
	}

	@Override
	public void delFree(int num) {
		sqlSession.delete("free.delFree" , num);
	}
	
	
	
}
