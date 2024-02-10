package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;	// DI for RestTemplate 
	
	public String createAccount(Gpay gpay) {
		Optional<Gpay> op  = gpayRepository.findById(gpay.getGpayid());
		if(op.isPresent()) {
			return "Gpay account already exists";
		}else {
			gpayRepository.save(gpay);
			return "Account created successfully";
		}
	}
	
	public List<Gpay> findAllGpay() {
		return gpayRepository.findAll();
	}
	
	public String findBalance(int gpayid) {
		Optional<Gpay> op  = gpayRepository.findById(gpayid);
		if(op.isPresent()) {
			Gpay gpay = op.get();
			String emailid = gpay.getEmailid();
			// gpay micro service communicating to account micro service using physical ip address. 
	//String result = restTemplate.getForObject("http://localhost:8383/account/findBalanceByEmailId/"+emailid,String.class);
	// with @LoadBalanced with @Bean annotation we can communicate one service with another service by name 
	String result = restTemplate.getForObject("http://ACCOUNTSERVICE/account/findBalanceByEmailId/"+emailid,String.class);
			return result;
		}else {
			
			return "Gpay account not exists";
		}
	}
}
