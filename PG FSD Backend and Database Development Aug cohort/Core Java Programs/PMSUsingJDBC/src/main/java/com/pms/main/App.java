package com.pms.main;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class App {

	public static void main(String[] args) {
	ProductService ps = new ProductService();
	Product p1  = new Product(3, "Pen drive", 1200);
	String result = ps.storeProduct(p1);
	System.out.println(result);

	}

}
