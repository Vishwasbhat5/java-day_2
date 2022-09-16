package com.sonata.calculator;



public class calc_one {

	
		public  int add(int a , int b)
		{
			return a+b;
		}
		
		public int div (int a , int b)
		{
			return a/b;
			
		}
		public static void main(String[] args) 
		{
			calc_one c1 = new calc_one();
			System.out.println(c1.add(10,20));
			System.out.println(c1.div(10,20));
		}
	}


