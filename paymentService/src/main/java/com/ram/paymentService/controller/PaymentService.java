package com.ram.paymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentService {

	@GetMapping("/microservice/paymentService")
	public String getOrderPrcs() {
		return "Welcome to Payment Service";
	}
}
