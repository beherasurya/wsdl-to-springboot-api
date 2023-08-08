package com.app.soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.soap.service.CalcService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	@Autowired
	CalcService calculatorService;
	
	@GetMapping("/add/{firstNo}/{secondNo}")
	public int add(@PathVariable int firstNo,@PathVariable int secondNo) {
		return calculatorService.add(firstNo, secondNo);
	}
	
	@GetMapping("/sub/{firstNo}/{secondNo}")
	public int subtract(@PathVariable int firstNo,@PathVariable int secondNo) {
		return calculatorService.subtract(firstNo, secondNo);
	}
	
	@GetMapping("/mul/{firstNo}/{secondNo}")
	public int multiply(@PathVariable int firstNo,@PathVariable int secondNo) {
		return calculatorService.multiplication(firstNo, secondNo);
	}
	
	@GetMapping("/div/{firstNo}/{secondNo}")
	public int divide(@PathVariable int firstNo,@PathVariable int secondNo) {
		return calculatorService.division(firstNo, secondNo);
	}
	
}
