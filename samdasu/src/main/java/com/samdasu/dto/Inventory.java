package com.samdasu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
	private int inum;
	private int pnum;
	private int iprice;
	private int oprice;
	private int amount;
	private String remark;
	private String resdate;
}
