package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samdasu.dao.MemberDAO;
import com.samdasu.dto.Member;


@Service
public class MemberServiceImpl implements MemberService {


	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<Member> getMembers() {
		return memberDAO.getMembers();
	}

	@Override
	public Member getMember(int num) {
		return memberDAO.getMember(num);
	}

	@Override
	public void insMeber(Member member) {
		memberDAO.insMeber(member);
	}

	@Override
	public void upMember(Member member) {
		memberDAO.upMember(member);
	}

	@Override
	public void delMember(int num) {
		memberDAO.delMember(num);
	}
	
}
