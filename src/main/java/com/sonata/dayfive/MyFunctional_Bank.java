package com.sonata.dayfive;

public interface MyFunctional_Bank
{
	void m1();
	default void m2() {System.out.println("Default method - 1");}
	static void m3() {System.out.println("Default method - 2");}
	}


