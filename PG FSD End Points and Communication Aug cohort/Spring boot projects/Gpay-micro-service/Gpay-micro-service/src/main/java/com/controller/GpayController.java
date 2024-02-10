package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Gpay;
import com.service.GpayService;

@RestController
@RequestMapping("gpay")
public class GpayController {

	@Autowired
	GpayService gpayService;
	
	// http://localhost:8484/gpay/create 
	// {"gpayid":100,"emailid":"ravi@gmail.com"}
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAcount(@RequestBody Gpay gpay) {
		return gpayService.createAccount(gpay);
	}
	
	// http://localhost:8484/gpay/findAll
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gpay> findAll() {
		return gpayService.findAllGpay();
	}
}
