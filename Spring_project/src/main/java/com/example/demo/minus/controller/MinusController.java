package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {

	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minus")
	public String showMinus() {
		return "minus.html";
	}

	@PostMapping("minus")
	public String minusResult(@RequestParam("numOne") int numOne, @RequestParam("numTwo") int numTwo, Model model) {
		model.addAttribute("result", minusService.result(numOne, numTwo));
		return "minus.html";
	}

}