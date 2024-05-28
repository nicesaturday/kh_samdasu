package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Free {
	private int fnum;
    private String title;
    private String content;
    private int hits;
    private String id;
    private String name;
    private String resdate;
}
