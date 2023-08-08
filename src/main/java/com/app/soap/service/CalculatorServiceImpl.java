package com.app.soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.Calculator;

@Service
public class CalculatorServiceImpl implements CalcService{

	Calculator calculator = new Calculator();

	@Override
	public int add(int firstNumber, int secondNumber) {
		int additionResult =calculator.getCalculatorSoap().add(firstNumber, secondNumber);
		return additionResult;
	}

	

	@Override
	public int subtract(int firstNumber, int secondNumber) {
		int subtractResult =calculator.getCalculatorSoap().subtract(firstNumber, secondNumber);
		return subtractResult;
	}

	@Override
	public int division(int firstNumber, int secondNumber) {
		int divisionResult =calculator.getCalculatorSoap().divide(firstNumber, secondNumber);
		return divisionResult;
	}

	@Override
	public int multiplication(int firstNumber, int secondNumber) {
		int multiplicationResult =calculator.getCalculatorSoap().multiply(firstNumber, secondNumber);
		return multiplicationResult;
	}


}
