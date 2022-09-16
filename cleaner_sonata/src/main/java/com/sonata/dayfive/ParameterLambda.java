package com.sonata.dayfive;

public class ParameterLambda {
/* implements CalTor{
 @Override
 public double substract(double d1,double d2){
 return 0;
 }
 }
	*/
	
	
	
	
	public static void main(String[] args) 
	{
	//ParameterLambda p1 = new ParameterLambda();
		//p1.substract(10,20);
		/* CalTor c1 = (input) -> System.out.println("Sum:" + input);
		 * c1.sum(10);
		*/
		//same can be written in differeny way
		
		
		CalTor c2=(i1,i2) -> {return i1 - i2;};
		CalTor c3 = (i1,i2) ->{
			if(i2<i1)
			{
				throw new RuntimeException("message");}
			else 
			{return i2 - i1;}
			};
			System.out.println(c2.substract(20,10));
			System.out.println(c3.substract(20,30));
			
			MyFunctional_Interface show =()-> {System.out.println("this is my");};
	
	}
	}

