package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private int bnum;
    private String author;
    private String btitle;
    private String bcomment;
    private String resdate; 
}
