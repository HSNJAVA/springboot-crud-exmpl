package com.hsnjava.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hsnjava.crud.entities.Product;
import com.hsnjava.crud.exception.ResourceNotFoundException;

@Service
public interface ProductService {
	
	public Product createProduct(Product product) ;
		
	public List<Product> createProducts(List<Product> products);
	
	public Product getProductById(int id);
	
	public List<Product> getAllProducts();
	
	public String deleteProductById(int id);
	
	public Product updateProduct(int id,Product product) throws ResourceNotFoundException;

}
