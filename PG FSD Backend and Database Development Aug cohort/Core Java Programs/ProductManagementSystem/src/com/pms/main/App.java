package com.pms.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class App {

	public static void main(String[] args) {
		int choice;
		String con;
		Scanner sc = new Scanner(System.in);
		int pid;
		String pname;
		float price;
		String result;
		ProductService ps = new ProductService();
		do {
			System.out.println("1:Add, 2: Delete, 3:Update 4:Retrieve 5 : Find");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("plz enter the pid");
			      pid = sc.nextInt();
			      System.out.println("plz enter the pname");
			      pname = sc.next();
			      System.out.println("plz enter the price");
			      price = sc.nextFloat();
			      Product p = new Product(pid, pname, price);
			      result = ps.addProduct(p);
			      System.out.println(result);
				break;
			case 2:System.out.println("plz enter the pid");
		      		pid = sc.nextInt();
		      		result = ps.deleteProduct(pid);
		      		System.out.println(result);
		      		break;
			case 3:	System.out.println("plz enter the pid");
		      		pid = sc.nextInt();
		      		System.out.println("plz enter the price");
		      		price = sc.nextFloat();
		      		Product p1  = new Product();
		      		p1.setPid(pid);
		      		p1.setPrice(price);
		      		result = ps.updateProduct(p1);
		      		System.out.println(result);
				break;
			case 4:List<Product> listOfProduct = ps.retrieveProduct();
			       Iterator<Product> li = listOfProduct.iterator();
			       while(li.hasNext()) {
			    	   Product p2 = li.next();
			 System.out.println("PId is "+p2.getPid()+" pname "+p2.getPname()+" Price "+p2.getPrice());
			       }
	
				break;
			case 5:System.out.println("plz enter the pid");
      				pid = sc.nextInt();
      				Product p4 = ps.findProduct(pid);
      				if(p4==null) {
      				System.out.println("product not present");	
      				}else {
      System.out.println("PId is "+p4.getPid()+" pname "+p4.getPname()+" Price "+p4.getPrice());
      				}
				break;
			default:
				break;
			}
			System.out.println("do you want to continue(y/no)?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You!");

	}

}
