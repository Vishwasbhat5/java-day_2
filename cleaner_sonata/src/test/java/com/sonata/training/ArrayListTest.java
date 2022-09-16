package com.sonata.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonata.Student_Product.ArrayListDemo;

class ArrayListTest {

	@Test
	public void testadd() 
	{
	ArrayListDemo arrobj1 =  new ArrayListDemo();
	arrobj1.add(1);
	arrobj1.add(2);
	arrobj1.add(3);
	arrobj1.add(4);
	arrobj1.add(5);
	arrobj1.add(6);
	
	int size = arrobj1.getSize();
	System.out.println(size);
	assertEquals(6,size);
	}
	
	
	@Test
	public void testdelete() 
	{
	ArrayListDemo arrobj2 =  new ArrayListDemo();
	arrobj2.add(1);
	arrobj2.add(2);
	arrobj2.add(3);
	
	arrobj2.delete(2);
	arrobj2.delete(1);
	
	int size = arrobj2.getSize();
	System.out.println(size);
	assertEquals(1,size);
	}

}
