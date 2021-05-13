package com.peru.dev.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}

}
