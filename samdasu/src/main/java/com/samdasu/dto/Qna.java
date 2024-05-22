package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qna {
	private String qnum;
    private String id;
    private String qtitle;
    private String qcomment;
    private String q_level;
    private String parno;
    private int hits;
    private String resdate; 
}
