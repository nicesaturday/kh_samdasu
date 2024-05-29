package com.samdasu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samdasu.dto.Product;


@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getProductCount() {
		return sqlSession.selectOne("product.getProductCount");
	}

	@Override
	public List<Product> getProducts() {
		return sqlSession.selectList("product.getProducts");
	}

	@Override
	public Product getProduct(int num) {
		return sqlSession.selectOne("product.getProduct" , num);
	}

	@Override
	public void insProduct(Product product) {
		sqlSession.insert("product.insProduct", product);
	}

	@Override
	public void upProduct(Product product) {
		sqlSession.update("product.upProduct",product);
	}

	@Override
	public void delProduct(int num) {
		sqlSession.delete("product.delProduct",num);
	}
	
}
