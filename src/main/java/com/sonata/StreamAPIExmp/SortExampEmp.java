package com.sonata.StreamAPIExmp;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sonata.StreamAPIExmp.DataBaseEmp;
import com.sonata.StreamAPIExmp.Employee;


class MyComparator implements Comparator<Employee>
{

	public int  compare(Employee o1,Employee o2)
	
	{
		return (int)(o1.getEmpSal() - o2.getEmpSal());
	}


}


public class SortExampEmp {

	public static void main(String[] args)
	{
		List <Employee> employee = DataBaseEmp.getEmployee();
	//traditional way
		Collections.sort(employee , new MyComparator());
		System.out.println(employee);
		
		
		//with lambda expression
		
	Collections.sort(employee,(o1,o2) -> (int)(o1.getEmpSal() - o2.getEmpSal()));
	System.out.println(employee);
	
	
	
	//using with stream API sort method
	
	employee
.stream()
.sorted((o1,o2)->(int)(o1.getEmpSal() - o2.getEmpSal()))
.forEach(System.out::println);

	//if want in descending just change o1 to o2

//still more optimizations can be done with comparator call in sort method
	}

}
