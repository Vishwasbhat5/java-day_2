package com.sonata.JDBCExampleMaven;

import java.util.List;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.EModel.Employee;

public class empApp
{
public static void main(String[] args)
{
Employee s1 =new Employee();
EmployeeImpl s2=new EmployeeImpl();
s1.setEmpID(112);
s1.setEmpName("sonata");
s1.setEmpSal(2345.98);

//EmployeeImpl p1 = new EmployeeImpl();
//int a1 = p1.save(s1);
//System.out.println(a1);



List<Employee> s3 = s2.getData();
        for(int i=0;i<s3.size();i++) 
  {
            System.out.println(s3.get(i).getEmpID());
            System.out.println(s3.get(i).getEmpName());
       System.out.println(s3.get(i).getEmpSal());
 }
 
}
}
