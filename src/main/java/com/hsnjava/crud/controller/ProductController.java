package com.hsnjava.crud.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsnjava.crud.entities.Product;
import com.hsnjava.crud.exception.ResourceNotFoundException;
import com.hsnjava.crud.services.ProductService;

@RestController
@RequestMapping("/hsnjava")
public class ProductController {

	@Autowired
	ProductService productService;

	private static final Logger logger = LogManager.getLogger(ProductController.class);

	@PostMapping("/addProduct")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);

	}

	@PostMapping("/addProducts")
	public List<Product> createProducts(@RequestBody List<Product> product) {
		return productService.createProducts(product);

	}

	@GetMapping("/getAllProducts")
	public List<Product> getProducts() {

		logger.info("Exit AllProducts");
		return productService.getAllProducts();
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		logger.info("Enter findById");
		logger.info("Exit deleteProductById");
		return productService.getProductById(id);

	}

	@DeleteMapping("product/{id}")
	public String deleteProductById(@PathVariable int id) {
		logger.info("Delete ProductById");
		return productService.deleteProductById(id);

	}

	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable(value = "id") int id, @RequestBody Product product)
			throws ResourceNotFoundException {
		return productService.updateProduct(id, product);

	}

}
