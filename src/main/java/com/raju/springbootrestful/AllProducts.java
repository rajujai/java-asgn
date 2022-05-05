package com.raju.springbootrestful;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AllProducts {
	Map<Integer, Product> map = new HashMap<>();
	void addProducts() {
		map.put(1, new Product(1, "Vivo V22", 23000, "Vivo", "Mobile", "A001", 1));
		map.put(2, new Product(2, "Vivo V21", 20000, "Vivo", "Mobile", "A001", 1));
		map.put(3, new Product(3, "Oppo F22", 27000, "Oppo", "Mobile", "A004", 10));
		map.put(4, new Product(4, "Iphone 13", 79000, "Apple", "Mobile", "A003", 11));
		map.put(5, new Product(5, "Samsung S22", 89000, "Samsung", "Mobile", "A002", 101));
	}
	@RequestMapping(value = "/products")
	List<Product> getAllProducts(){
		addProducts();
		return map.values().stream().toList();
	}
	
	@RequestMapping(value = "/product/{id}")
	Product getProductById(@PathVariable("id") int id) {
		addProducts();
		return map.get(id);
	}
	
	@PostMapping("/product")
	String createProduct(@RequestBody Product product) {
		map.put(product.getId(), product);
		return "Product added successfully. Details below : \n" + product.toString();
	}
	@DeleteMapping(value = "/product/{id}")
	String deleteProductById(@PathVariable("id") int id) {
		addProducts();
		map.remove(id);
		return "Product: "+id+" deleted!";
	}
	@PutMapping("/product/{id}")
	String updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
		map.put(id, product);
		return "Product updated successfully. Details below : \n" + product.toString();
	}
}
