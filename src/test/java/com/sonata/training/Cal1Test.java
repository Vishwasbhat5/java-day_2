package com.sonata.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.calculator.calc_one;

class Cal1Test {
calc_one c1 = new calc_one();
	
	
	@Test
	public void addTest() 
	{
	
		
		Assertions.assertEquals(4, c1.add(2, 2));
		
	}
	
	
	@Test
	public void divTest() 
	{
	
		//int x = c1.div(1,1);
		assertThrows(ArithmeticException.class, ()->c1.div(1, 0),"its an error");
		
	}
	



}
