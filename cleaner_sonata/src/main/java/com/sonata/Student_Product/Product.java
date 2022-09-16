package com.sonata.Student_Product;

	public class Product implements Comparable<Product>
	{
	int ID;
	String Name;
	double Price;


	 Product(int ID,String Name,double Price)
	{
	this.ID = ID;
	this.Name = Name;
	this.Price = Price;
	}
	
	 
	 public int compareTo(Product st) 
	 {
	 if(Price == st.Price)
	 	return 0;
	 else 
		 if (Price> st.Price)
	 	return 1;
	 else
	 	return -1;
	 }

}
