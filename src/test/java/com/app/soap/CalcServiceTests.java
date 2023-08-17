package com.app.soap.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;

@SpringBootTest(classes = {CalcServiceTests.class})
public class CalcServiceTests {

	@InjectMocks
	CalcService calcService;
	
	@Test
	 void add() {
		
		assertEquals(100, calcService.add(90, 10));
	}
	@Test
	 void subtract() {
		
		assertEquals(10, calcService.subtract(100, 90));
	}
	@Test
	 void divide() {
		
		assertEquals(2, calcService.division(2000, 1000));
	}
	@Test
	 void multiply() {
		
		assertEquals(90, calcService.multiplication(9, 10));
	}
	
}
