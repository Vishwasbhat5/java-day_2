package com.sonata.Student_Product;

import java.util.ArrayList;
import java.util.Collections;

public class TestStud 
{
public static void main(String[] args) 
	
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(101,"Vijay",23));
		a1.add(new Student(102,"vishwas",25));
		a1.add(new Student(103,"vishal",28));
	
		Collections.sort(a1);
		for(Student st:a1)
		{
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	
	
	}

}
