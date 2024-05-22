package com.samdasu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samdasu.dto.Member;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public List<Member> getMembers() {
		return sqlSession.selectList("member.getMembers");
	}

	@Override
	public Member getMember(int num) {
		return sqlSession.selectOne("member.getMember" , num);
	}

	@Override
	public void insMember(Member member) {
		sqlSession.insert("member.insMember" , member);
	}

	@Override
	public void upMember(Member member) {
		sqlSession.update("member.upMember" , member);
	}

	@Override
	public void delMember(int num) {
		sqlSession.delete("member.delMember" , num);
	}

	
}
