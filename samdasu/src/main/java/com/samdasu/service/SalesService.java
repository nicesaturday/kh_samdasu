package com.samdasu.service;

import java.util.List;

import com.samdasu.dto.Sales;

public interface SalesService {
	public int getTotalCount();
	public List<Sales> getAllSaless();
	public List<Sales> getStSaless(String st);
	public List<Sales> getDelSaless(String deltatus);
	public List<Sales> getPnumSalesList(int pnum);
	public List<Sales> getSalesList(String id);
	public Sales getSales(int snum);
	public void insSales(Sales sales);
	public void upSales(Sales sales);
	public void upDelivery(Sales sales);
	public void completeDelivery(Sales sales);
	public void delSales(int snum);
}
