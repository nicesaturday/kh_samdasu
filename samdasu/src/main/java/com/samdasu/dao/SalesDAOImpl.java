package com.samdasu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samdasu.dto.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("sales.getTotalCount");
	}

	@Override
	public List<Sales> getAllSaless() {
		return sqlSession.selectList("sales.getAllSaless");
	}
	
	@Override
	public List<Sales> getStSaless(String st) {
		return sqlSession.selectList("sales.getStSaless",st);
	}

	@Override
	public List<Sales> getDelSaless(String deltatus) {
		return sqlSession.selectList("sales.getDelSaless", deltatus);
	}

	@Override
	public List<Sales> getPnumSalesList(int pnum) {
		return sqlSession.selectList("sales.getPnumSalesList", pnum);
	}

	@Override
	public List<Sales> getSalesList(String id) {
		return sqlSession.selectList("sales.getSalesList",id);
	}

	@Override
	public Sales getSales(int snum) {
		return sqlSession.selectOne("sales.getSales", snum);
	}

	@Override
	public void insSales(Sales sales) {
		sqlSession.insert("sales.insSales", sales);
	}

	@Override
	public void upSales(Sales sales) {
		sqlSession.update("sales.upSales",sales);
	}

	@Override
	public void upDelivery(Sales sales) {
		sqlSession.update("sales.upDelivery" , sales);
	}

	@Override
	public void completeDelivery(Sales sales) {
		sqlSession.update("sales.completeDelivery" , sales);
	}

	@Override
	public void delSales(int snum) {
		sqlSession.delete("sales.delSales", snum);
	}
	
}
