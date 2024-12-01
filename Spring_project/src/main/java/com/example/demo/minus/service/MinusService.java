package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

	public int result(int numOne, int numTwo) {
		int result = numOne - numTwo;
		return result;
	}
}