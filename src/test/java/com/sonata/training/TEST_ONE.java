package com.sonata.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.Impl.EmpImpl;
import com.sonata.model.Employee;

class TEST_ONE {
	
		Employee e1 = new Employee();
		EmpImpl e2 = new EmpImpl();
		
		@Test
		public void yearlysal () 
		{
		
			
			e1.setEmpSal(10);
			Assertions.assertEquals(120,e2.yearlysal(e1));
			
		}
		
		
		@Test
		public void appsal() 
		{
		
		
		e1.setEmpSal(101);
			Assertions.assertEquals(5000,e2.appsal(e1));
			
		}
	
}
