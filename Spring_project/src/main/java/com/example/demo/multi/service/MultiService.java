package com.example.demo.multi.service;

import org.springframework.stereotype.Service;

@Service
public class MultiService {

	public int multi(int numOne, int numTwo) {
		int result = numOne * numTwo;
		return result;
	}
}