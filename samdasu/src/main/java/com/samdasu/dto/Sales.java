package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sales {
	private String snum;
    private String pnum;
    private String amount; 
    private String tot;
    private String id; 
    private String paymethod;
    private String paynum; 
    private String addr; 
    private String tel;
    private String delcom; 
    private String deltel; 
    private String delnum; 
    private String delstatus;
    private String st;
}
