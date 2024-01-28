package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
			productRepository.save(product);	// pre-defined method to save 
			return "Product stored successfully";
						
//			Optional<Product> op = productRepository.findById(product.getPid()); 	
//			if(op.isPresent()) {
//				return "Product id must be unique";
//			}else {
//				productRepository.save(product);
//				return "Product stored successfully";
//			}
	
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();			// retrieve list of product without sql or jpql or hql 
	}
	
	
	public String deleteProduct(int pid) {
		Optional<Product> op = productRepository.findById(pid); 	
		if(op.isPresent()) {
			productRepository.deleteById(pid);
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String updateProduct(Product product) {		// pid,price, qty 
		Optional<Product> op = productRepository.findById(product.getPid()); 	
		if(op.isPresent()) {
			Product p	= op.get();
			p.setPrice(product.getPrice());
			p.setQty(product.getQty());
			
			productRepository.saveAndFlush(p);
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
}
