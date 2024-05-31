package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samdasu.dao.SalesDAO;
import com.samdasu.dto.Sales;

@Service
public class SalesServiceImpl implements SalesService {

	
	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public int getTotalCount() {
		return salesDAO.getTotalCount();
	}

	@Override
	public List<Sales> getAllSaless() {
		return salesDAO.getAllSaless();
	}

	@Override
	public List<Sales> getStSaless(String st) {
		return salesDAO.getStSaless(st);
	}

	@Override
	public List<Sales> getDelSaless(String deltatus) {
		return salesDAO.getDelSaless(deltatus);
	}

	@Override
	public List<Sales> getPnumSalesList(int pnum) {
		return salesDAO.getPnumSalesList(pnum);
	}

	@Override
	public List<Sales> getSalesList(String id) {
		return salesDAO.getSalesList(id);
	}

	@Override
	public Sales getSales(int snum) {
		return salesDAO.getSales(snum);
	}

	@Override
	public void insSales(Sales sales) {
		salesDAO.insSales(sales);
	}

	@Override
	public void upSales(Sales sales) {
		salesDAO.upSales(sales);
	}

	@Override
	public void upDelivery(Sales sales) {
		salesDAO.upDelivery(sales);
	}

	@Override
	public void completeDelivery(Sales sales) {
		salesDAO.completeDelivery(sales);
	}

	@Override
	public void delSales(int snum) {
		salesDAO.delSales(snum);
	}
	
}
