package com.samdasu.service;

import java.util.List;

import com.samdasu.dto.Product;

public interface ProductService {
	public int getProductCount();
	public List<Product> getProducts();
	public Product getProduct(int num);
	public void insProduct(Product product);
	public void upProduct(Product product);
	public void delProduct(int num);
}
