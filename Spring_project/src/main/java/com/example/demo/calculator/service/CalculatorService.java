package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public String culclate(int numOne, int numTwo, String operator) {

		int result = 0;

		if ("+".equals(operator)) {
			result = numOne + numTwo;
		} else if ("-".equals(operator)) {
			result = numOne - numTwo;
		} else if ("*".equals(operator)) {
			result = numOne * numTwo;
		} else if ("/".equals(operator)) {
			if (numOne == 0 || numTwo == 0) {
				throw new ArithmeticException("ゼロ除算はできません");
			} else {
				result = numOne / numTwo;
			}
		}
		return String.valueOf(result);
	}
}