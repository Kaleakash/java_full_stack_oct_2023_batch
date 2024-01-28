package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;

	
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
	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET)
	public String findAllProductInfo(Model model) {
		List<Product> listOfProducts = productService.findAllProduct();
		model.addAttribute("products", listOfProducts);
		return "viewProducts";
	}
	
	
	
	
}
