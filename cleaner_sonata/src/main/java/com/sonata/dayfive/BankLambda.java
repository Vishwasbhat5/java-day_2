package com.sonata.dayfive;

public class BankLambda {

	public static void main(String[] args)
	{
		BankInt c2=(a,b) -> {return a + b;};
		BankInt c3 = (a,b) ->
		{
			if( (a+b) >= 50)
			{
				throw new RuntimeException("value is 49");}
			else 
				
			{return (a + b ) + 1;}
			
			};
			System.out.println(c2.add(20,20));
			System.out.println(c3.add(30,20));
			
			MyFunctional_Bank show =()-> {System.out.println("this is my");};

	}

}
