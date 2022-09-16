package com.day_three;

public class Empl_impl extends Employee implements Empl_intf 
{

	@Override
	public double skillBonus (int subjectUpgraded)
	{
		double sal = 1000;
		
		switch (subjectUpgraded) 
		{
		case 1: System.out.println(sal + (sal*0.1));  
	    break;  
	    case 2: System.out.println(sal + (sal*0.2));  
	    break;  
	    case 3: System.out.println(sal + (sal*0.3));  
	    break;
	    
	    default :System.out.println("no change");
		}
		
		return (subjectUpgraded);
	}


	@Override
	public void salcal()
	{
		
		
	}
	
	public static void main (String [] args) 
	{
		Empl_impl e1 =new Empl_impl();
		e1.skillBonus(2);
		System.out.println(e1.skillBonus(2));
	}



}
