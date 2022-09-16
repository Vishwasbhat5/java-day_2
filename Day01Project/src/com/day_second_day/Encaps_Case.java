package com.day_second_day;

public class Encaps_Case {

int accNo;
String accName;
double balance;


Encaps_Case(){}

Encaps_Case(int n, String name , double b)
{
	this.accNo = n;
	this.accName = name;
	this.balance = b;
	
}




public void deposit() {

	System.out.println(this.accNo);
	System.out.println(this.accName);
}
public void withdraw() {}

public static void main(String args[])
{
	Encaps_Case s1 = new Encaps_Case();
	s1.accNo =123;
	s1.accName = "vishwas";
	s1.balance = 345;
	
	s1.deposit();
	

Encaps_Case s2 = new Encaps_Case(234,"vishwas",456) ;
s2.deposit();
}



}
