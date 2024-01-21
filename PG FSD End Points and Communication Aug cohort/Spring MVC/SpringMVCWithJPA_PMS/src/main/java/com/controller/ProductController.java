package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "addProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) {// DI for reqeust and product 
		
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		String url = req.getParameter("url");
		
		product.setPname(pname);
		product.setPrice(price);
		product.setUrl(url);
		
		String result = productService.storeProduct(product);
		
		System.out.println(result);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addProduct.jsp");
		mav.addObject("msg", result);		// equal to request.setAttribute("msg",result);
		return mav;
	}
	
	
	@RequestMapping(value = "viewProducts",method = RequestMethod.GET)
	public ModelAndView viewAllProducts(HttpSession hs) {		// DI for session object 
	
	List<Product> listOfProducts = productService.findAllProduct();
	hs.setAttribute("listOfProducts", listOfProducts);
	
	ModelAndView mav = new ModelAndView();
	
	
	mav.setViewName("displayProduct.jsp");
	
	return mav;
	}
	
	
	
	
	
	
}
