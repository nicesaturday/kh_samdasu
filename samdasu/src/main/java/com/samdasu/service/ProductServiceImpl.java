package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samdasu.dao.ProductDAO;
import com.samdasu.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public int getProductCount() {
		return productDAO.getProductCount();
	}

	@Override
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

	@Override
	public Product getProduct(int num) {
		return productDAO.getProduct(num);
	}

	@Override
	public void insProduct(Product product) {
		productDAO.insProduct(product);
	}

	@Override
	public void upProduct(Product product) {
		productDAO.upProduct(product);
	}

	@Override
	public void delProduct(int num) {
		productDAO.delProduct(num);
	}
	
}
