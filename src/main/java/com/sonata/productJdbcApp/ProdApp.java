package com.sonata.productJdbcApp;

import com.sonata.ProductImplJDBC.productImplJdbc;
import com.sonata.productJDBC.ProductJdbc;

public class ProdApp {
public static void main(String[] args) {
		ProductJdbc s1 = new ProductJdbc();
		s1.setProId(102);
		s1.setProName("sunflower oil");
		s1.setProPrice(295.55);
		productImplJdbc e1 = new productImplJdbc();
		int a = e1.save(s1);
		System.out.println(a);
			

	}



	
	}