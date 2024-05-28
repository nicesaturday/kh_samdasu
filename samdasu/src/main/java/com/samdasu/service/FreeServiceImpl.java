package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samdasu.dao.FreeDAO;
import com.samdasu.dto.Free;

@Service
public class FreeServiceImpl implements FreeService {

	
	@Autowired
	private FreeDAO FreeDAO;
	
	@Override
	public int getTotalFreeCount() {
		return FreeDAO.getTotalFreeCount();
	}

	@Override
	public List<Free> getFrees() {
		return FreeDAO.getFrees();
	}

	@Transactional
	@Override
	public Free getFree(int num) {
		FreeDAO.upFreeHits(num);
		return FreeDAO.getFree(num);
	}

	@Override
	public void insFree(Free Free) {
		FreeDAO.insFree(Free);
	}

	@Override
	public void upFree(Free Free) {
		FreeDAO.upFree(Free);
	}

	@Override
	public void upFreeHits(int num) {
		FreeDAO.upFreeHits(num);
	}

	@Override
	public void delFree(int num) {
		FreeDAO.delFree(num);
	}
	
}
