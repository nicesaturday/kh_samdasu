package com.samdasu.dto;

import java.util.List;

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
	private List<UploadData> images;
}
