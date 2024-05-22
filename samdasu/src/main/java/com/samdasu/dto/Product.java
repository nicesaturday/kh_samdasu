package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int pnum;
	private String cate;
	private String pname;
	private String pcomment;
	private int pprice;
	private String img;
}
