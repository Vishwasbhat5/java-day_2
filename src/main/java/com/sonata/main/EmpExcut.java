package com.sonata.main;

import com.sonata.Impl.EmpImpl;
import com.sonata.model.Employee;

public class EmpExcut 
{
public static void main(String[] args)
{
	Employee e1 = new Employee();
	e1.setEmpID(123);
	e1.setEmpName("VISHWAS");
	e1.setEmpSal(100000);
	EmpImpl e2 = new EmpImpl();
	System.out.println(e2.yearlysal(e1));
	System.out.println(e2.appsal(e1));
}
}