package com.samdasu.service;

import java.util.List;

import com.samdasu.dto.Free;

public interface FreeService {
	public int getTotalFreeCount();
	public List<Free> getFrees();
	public Free getFree(int num);
	public void insFree(Free Free);
	public void upFree(Free Free);
	public void upFreeHits(int num);
	public void delFree(int num);
}
