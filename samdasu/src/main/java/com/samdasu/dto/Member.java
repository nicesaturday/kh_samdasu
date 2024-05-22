package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int mnum;
	private String id;
	private String pw;
	private String mname;
	private String email;
	private String tel;
	private String addr1;
	private String addr2;
	private String postcode;
	private String birth;
	private String resdate;
		
}
