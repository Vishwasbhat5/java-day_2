package com.sonata.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.sonata.example.demo.Addition;
import com.sonata.example.demo.CalculatorSpring;

public class DefCalculator implements CalculatorSpring {
	@Autowired
	Addition defCalculator;
	
	
	@Override
	public int callAdd(int n1, int n2) {
		return defCalculator.add(n1, n2);
	}
	
	public void setAdd(Addition add) {
		this.defCalculator = add;
	}
	
	

}


