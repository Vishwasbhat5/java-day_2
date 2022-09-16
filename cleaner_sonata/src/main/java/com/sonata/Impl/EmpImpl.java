package com.sonata.Impl;

import com.sonata.Intf.EmpIntf;

import com.sonata.model.Employee;

public class EmpImpl  implements  EmpIntf

{

	@Override
	public double yearlysal(Employee e1) 
	{
		double Ysal;
		Ysal = e1.getEmpSal() *12;
		return Ysal;
	}

	@Override
	public double appsal(Employee e1) 
	{
		double Asal;	
		if(e1.getEmpSal()<10000) {
			Asal = 5000;
		}else {
			Asal =1000;
		}
		return Asal;
	}

}
