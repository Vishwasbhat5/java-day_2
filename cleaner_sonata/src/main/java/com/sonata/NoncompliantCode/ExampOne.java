package com.sonata.NoncompliantCode;

public class ExampOne {
	
	int target = -5;
	int num = 3;
	{
	target = -num; 
	target += num;
	}
	
	public static void main(String[] args)
	{
	
	}
}


/*
int target = -5;
int num = 3;

target = -num;  // Compliant; intent to assign inverse value of num is clear
target += num;
*/