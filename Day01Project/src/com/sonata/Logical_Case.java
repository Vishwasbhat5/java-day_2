package com.sonata;

public class Logical_Case {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 System.out.println((5 > 3) && (8 > 5)); 
		 System.out.println((5 > 3) && (8 < 5));  
		    
		    System.out.println((5 < 3) || (8 > 5));
		    System.out.println((5 > 3) || (8 < 5));  
		    System.out.println((5 < 3) || (8 < 5)); 
		   
		    System.out.println(!(5 == 3));  
		    System.out.println(!(5 > 3));  
	}

}
