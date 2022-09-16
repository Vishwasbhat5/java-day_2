package com.sonata.StreamAPIExmp;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {

	public static List<Employee>getEmployee() 
	{
List<Employee> list = new ArrayList();
list.add(new Employee(172,"Roshan","IT",5000));
list.add(new Employee(355,"Rohan","civil",8500));
list.add(new Employee(172,"Akash","E&C",3000));
list.add(new Employee(172,"Amrut","CSE",6000));
list.add(new Employee(172,"Rakesh","ME",9000));
return list;
	}

}
