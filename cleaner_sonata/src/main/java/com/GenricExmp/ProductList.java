package com.GenricExmp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductList 
{

	public static void main(String[] args)
	{
		List<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(123,"TV",345));
		p1.add(new Product(135,"MOBILE",246));
		p1.add(new Product(111,"LAPTOP",222));
	
	
	for(Product p2:p1)
	{
		System.out.println(p2.pID + " " + p2.pName + " " + p2.pPrice);
	}
	
	LinkedList<String> l1 = new LinkedList<String>();
	
	
	l1.add("vishwas");
	l1.add("Simple");
	l1.add("just");
	l1.add("show");
	l1.addFirst("Simple");
	l1.addLast("last");
	
	System.out.println(l1);
	
	Iterator<String> i1 = l1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	}
	
	
	}


