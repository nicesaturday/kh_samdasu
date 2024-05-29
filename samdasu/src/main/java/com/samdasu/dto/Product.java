package com.samdasu.dto;

import java.util.List;

import com.samdasu.vo.UploadData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int pn;
	private String cate;
	private String pname;
	private String pcomment;
	private int pprice;
	private String img;
	private String img2;
	private String img3;
}
