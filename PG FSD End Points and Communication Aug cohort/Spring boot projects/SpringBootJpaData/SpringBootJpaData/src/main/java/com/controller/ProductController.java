package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller				// RestFull Controller 
public class ProductController {
	
	@Autowired
	ProductService productService;

	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value = "addProduct",method = RequestMethod.GET)
	public String openAddProductPage(Product product,Model model) {
		model.addAttribute("product", product);
		return "addProduct";
	}
	
	@RequestMapping(value="storeProduct",method = RequestMethod.POST)
	public String storeProduct(Product product,Model model) {
	
		String result = productService.storeProduct(product);
		model.addAttribute("product", product);
		model.addAttribute("msg",result);
		return "index";
	}
	
	@RequestMapping(value="storeProductIntoDb",method = RequestMethod.POST)
	public String addProductIntoDb(HttpServletRequest req, HttpServletResponse res, Product product, Model model) {
	
	String pname = req.getParameter("pname");
	int price = Integer.parseInt(req.getParameter("price"));
	int qty = Integer.parseInt(req.getParameter("qty"));
	
	product.setPname(pname);
	product.setPrice(price);
	product.setQty(qty);
	
		String result = productService.storeProduct(product);
	model.addAttribute("product", product);
	model.addAttribute("msg",result);
		return "index";
	}
	
	
	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET)
	public String findAllProductInfo(Model model) {
		List<Product> listOfProducts = productService.findAllProduct();
		model.addAttribute("products", listOfProducts);
		model.addAttribute("p", listOfProducts.get(0));
		return "viewProducts";
	}
	

	@RequestMapping(value = "deleteProduct",method = RequestMethod.GET)
	public String deleteProductPage() {
		return "deleteProduct";
	}
	
	@RequestMapping(value="deleteProduct",method = RequestMethod.POST)
	public String deleteProduct(HttpServletRequest req,Model model) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String result = productService.deleteProduct(pid);
		model.addAttribute("msg",result);
		return "index";
	}
	
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.GET)
	public String openUpdatetPage(Product product,Model model) {
		model.addAttribute("product", product);
		return "updateProduct";
	}
	
	@RequestMapping(value="updateProductFromDb",method = RequestMethod.POST)
	public String updateProduct(Product product,Model model) {
		String result = productService.updateProduct(product);
		model.addAttribute("product", product);
		model.addAttribute("msg",result);
		return "index";
	}
}
