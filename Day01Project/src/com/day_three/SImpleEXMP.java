package com.day_three;

public class SImpleEXMP 
{

	private int add(int a, int b)
	{
		return a+b;
	}
	

	int sub(int a ,int b)
	{
		return b-a;
		}
	
	protected int mul(int a ,int b)
	{
		return a*b;
		}
	
	
	
	public int div(int a ,int b)
	{
		return a/b;
		}




public static void main(String[] args)
{
	SImpleEXMP s1 = new SImpleEXMP();
	System.out.println(s1.add(2, 2));
	
	System.out.println(s1.sub(4, 8));
	
	System.out.println(s1.mul(2, 3));
	
	System.out.println(s1.div(8, 2));
	}
	
	
}