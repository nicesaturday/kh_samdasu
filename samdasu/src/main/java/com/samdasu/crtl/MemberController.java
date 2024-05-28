package com.samdasu.crtl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samdasu.dto.Member;
import com.samdasu.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		
		List<Member> memberList = memberService.getMembers();
		model.addAttribute("memberList", memberList);
		return "member/login";
	}
	
	@GetMapping("/join")
	public String getJoin(Model model) {
		
		return "member/join";
	}
	
	@PostMapping("/join")
	public String postJoin(@ModelAttribute("Member") Member member , Model model) {
		
		return "member/join";
	}
}
