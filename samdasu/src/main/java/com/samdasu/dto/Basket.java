package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Basket {
	private int bknum;
    private String id;
    private int pnum; 
    private int amount;
    private String remark; 
    private String resdate;
}
