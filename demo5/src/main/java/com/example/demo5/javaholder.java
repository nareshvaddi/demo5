package com.example.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;





public class javaholder {
	@Autowired
	private javaholder java;
	
	@GetMapping("/java")
	public javaholder getjobholderDetails1() 
	{
		javaholder java = new javaholder();
		
		java.setprdId(200);
	     java.setName("XYZ");
		 java.setSalary(40000.0);
		
		return java ;
	}

	private void setSalary(double d) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setprdId(int i) {
		// TODO Auto-generated method stub
		
	}


		
	}

	
		
	


