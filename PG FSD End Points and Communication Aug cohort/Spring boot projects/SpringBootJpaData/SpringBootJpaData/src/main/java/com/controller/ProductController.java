package com.controller;

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
	
}
