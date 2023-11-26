package com.pms.main;

import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.resource.DbResource;
import com.pms.service.ProductService;

public class App {

	public static void main(String[] args) {
	ProductService ps = new ProductService();
	Scanner sc = new Scanner(System.in);
	String con="";
	int pid;
	String pname;
	float price;
	String result;
	System.out.println("Welcome Product Management System App!");
	do {
		System.out.println("1:Add Product 2 : Update Product Price 3 : Delete Product 4 : Find Product 5: Retrieve all Products");
		System.out.println("Plz enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:System.out.println("Plz enter product pid");
		        pid = sc.nextInt();
		        System.out.println("Plz enter product pname");
		        pname = sc.next();
		        System.out.println("Plz enter product price");
		        price = sc.nextFloat();
		        Product p1 = new Product(pid,pname,price);
		        result = ps.storeProduct(p1);
		        System.out.println(result);
		        break;
		case 2:	System.out.println("Plz enter product pid");
        		pid = sc.nextInt();
        
        		System.out.println("Plz enter product price");
        		price = sc.nextFloat();
        		Product p2 = new Product();
        		p2.setPid(pid);
        		p2.setPrice(price);
        		result = ps.updateProduct(p2);
        		System.out.println(result);
        		break;
		case 3:	System.out.println("Plz enter product pid");
				pid = sc.nextInt();
				result = ps.deleteProduct(pid);
				System.out.println(result);
				break;
		case 4:System.out.println("Plz enter product pid");
				pid = sc.nextInt();
				result = ps.findProduct(pid);
				System.out.println(result);
	
			break;
		case 5:	List<Product> listOfProduct = ps.findAllProducts();
				for(Product p :listOfProduct) {
					//System.out.println("PId is "+p.getPid()+"PName is "+p.getPname()+" Price is "+p.getPrice());
					System.out.println(p);  // it internally to toString method 
				}
	
			break;
		default:	System.out.println("wrong choice");
			break;
		}
	System.out.println("Do you want to continue(y/n)");
	con = sc.next();
	} while (con.equals("y"));
	System.out.println("Thank you!");
	DbResource.close();
	}

}
