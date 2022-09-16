package com.sonata.dayfive;

public class Fridge implements Machine 
{
private String brand1;


public String getBrand1()
{
	return brand1;
}

public void setBrand1(String brand1) 
{
	this.brand1 = brand1;
	
}
 @Override
public String speedUp()
{
	return "this fridge is cools very fast";
}
@Override
public String slowDown()
{
	return "if its not on the work will be slow down";
}


	public static void main(String[] args)
	
	{
		
	Fridge f1 = new Fridge();
	System.out.println(f1.turnAlarmOn());
	System.out.println(f1.turnAlarmOff());
	
	}

}
