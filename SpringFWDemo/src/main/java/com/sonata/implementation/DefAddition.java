package com.sonata.implementation;

import org.springframework.stereotype.Component;

import com.sonata.example.demo.Addition;
@Component
public class DefAddition implements Addition
{
	public int add(int n1, int n2) 
	{
		return n1+n2;
	}
}
