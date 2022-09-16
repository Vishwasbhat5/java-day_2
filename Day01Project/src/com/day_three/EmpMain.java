package com.day_three;

public class EmpMain {

	public static void main(String[] args)
	{
	EmpModel e1 =new EmpModel();
	e1.setEmpId(123);
	e1.setEmpName("vishwas");
	e1.setEmpSal(456);
	
	
	System.out.println(e1);
	}

	@Override
	public String toString() {
		return "EmpMain []";
	}

}
