package com.pms.service;

import java.util.Iterator;
import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd  = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price msut be > 1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public String updateProduct(Product product) {
		if(pd.updateProductPrice(product)>0) {
			return "Product price updated successfully";
		}else {
			return "Product id not present"+product.getPid();
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product id not present"+pid;
		}
	}
	
	public String findProduct(int pid) {
		Product p = pd.findProductById(pid);
		if(p==null) {
			return "Product not present with id as "+pid;
		}else {
			return p.toString();		// it call Object class toString method 
		}
	}
	
	public List<Product> findAllProducts() {
	List<Product> listOfProduct = pd.findAllProducts();
	Iterator<Product> li  = listOfProduct.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		float discount = p.getPrice()*0.15f;
		p.setPrice(p.getPrice()-discount);
	}
	return listOfProduct;
	}
	
	
	
}
