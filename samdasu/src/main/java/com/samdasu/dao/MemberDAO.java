package com.samdasu.dao;

import java.util.List;

import com.samdasu.dto.Member;


public interface MemberDAO {
	public List<Member> getMembers();
	public Member getMember(int num);
	public void insMember(Member member);
	public void upMember(Member member);
	public void delMember(int num);
}
