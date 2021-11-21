package com.hsnjava.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hsnjava.crud.entities.Product;
import com.hsnjava.crud.exception.ResourceNotFoundException;
import com.hsnjava.crud.repository.ProductRepository;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public List<Product> createProducts(List<Product> products) {

		return productRepository.saveAll(products);
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	/*
	 * @Override public Product getProductById(int id) {
	 * 
	 * return productRepository.findById(id); }
	 */

	@Override
	public String deleteProductById(int id) {

		productRepository.deleteById(id);

		return "Product deleted: " + id;
	}

	@Override
	public Product updateProduct(int id, Product product) throws ResourceNotFoundException {

		Product findById = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(("Product not found on" + id)));

		Product prd = new Product();

		prd.setName(product.getName());
		prd.setPrice(product.getPrice());
		prd.setQuantity(product.getQuantity());

		productRepository.save(prd);

		return prd;
	}

	@Override
	public Product getProductById(int id) {

		return productRepository.getById(id);
	}

}
