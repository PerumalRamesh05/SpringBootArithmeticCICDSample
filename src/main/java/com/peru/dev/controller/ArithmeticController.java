package com.peru.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peru.dev.service.ArithmeticService;

@RestController
public class ArithmeticController {
	
	@Autowired
	ArithmeticService arithmeticService;
	
	@GetMapping("/api/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return arithmeticService.sum(a, b);
	}
	
	@GetMapping("/api/mul")
	public int mul(@RequestParam int a, @RequestParam int b) {
		return arithmeticService.multiply(a, b);
	}

}
