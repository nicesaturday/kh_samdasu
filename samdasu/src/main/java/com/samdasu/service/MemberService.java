package com.samdasu.service;

import java.util.List;

import com.samdasu.dto.Member;

public interface MemberService {
	public List<Member> getMembers();
	public Member getMember(int num);
	public void insMeber(Member member);
	public void upMember(Member member);
	public void delMember(int num);
}
