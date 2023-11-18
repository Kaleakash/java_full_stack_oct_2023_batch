package com.pms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pms.bean.Product;

public class ProductService {
	// int pid[];
	//String pname[];
	//float price[];
	
	// Product products[]=new Products[10];
	
	List<Product> listOfProduct = new ArrayList<>();
	
	public String addProduct(Product product) {
					int flag =0;
					if(listOfProduct.size()==0) {
						listOfProduct.add(product);
						return "Product added successfully";
					}else {
						Iterator<Product> li = listOfProduct.listIterator();
						while(li.hasNext()) {
							Product p = li.next();
							if(p.getPid()==product.getPid()) {
								flag++;
								break;
							}
						}
					}
					if(flag==0) {
						listOfProduct.add(product);
						return "Product added successfully";
					}else {
						return "Product id must be unique";
					}
					
	}
	public String deleteProduct(int pid) {
		int flag=0;
		Iterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				li.remove();
				flag++;
				break;
			}
		}
		if(flag==0) {
			
			return "Product not present";
		}else {
			return "Product deleted successfully";
		}
	}
	
	public String updateProduct(Product product) {		// pid,price 
		int flag=0;
		Iterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				p.setPrice(product.getPrice());
				flag++;
				break;
			}
		}
	
	if(flag==0) {
		
		return "Product not present";
	}else {
		return "Product price updated successfully";
	}
	
	}


	public List<Product> retrieveProduct() {
		return listOfProduct;
	}
	
	public Product findProduct(int pid) {
		Iterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				return p;
			}
		}
		return null;
	}
	
}





