package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.EModel.Employee;

public class EmployeeImpl implements EmpIntf
{
DB_Connection db =new DB_Connection();
int row =0;
//public int save(Object object) 
//{
//	Employee p1 =(Employee) object;
//	try 
//	{
//		PreparedStatement s1 =db.getConnection().prepareStatement("insert into employee values(?,?,?)");
//		s1.setInt(1, p1.getEmpID());
//		s1.setNString(2, p1.getEmpName());
//		s1.setDouble(3, p1.getEmpSal());
//		row = s1.executeUpdate();
//		db.closeConnection();
//	}
//	catch(SQLException e)
//	{
//		
//		e.printStackTrace();
//	}
//	return row;
//}
public List<Employee> getData() {
	List<Employee> stu = new ArrayList<Employee>();
   try {
	   PreparedStatement ps = db.getConnection().prepareStatement("select * from Employee");
	   ResultSet rs = ps.executeQuery();
	   
	   while (rs.next()) {
		   Employee s2 = new Employee();
		 s2.setEmpID(rs.getInt(1));
		 s2.setEmpName(rs.getNString(2));	
		 s2.setEmpSal(rs.getDouble(3));
		 stu.add(s2);
	   }
	  
   }catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
}
   return stu;
}

}
