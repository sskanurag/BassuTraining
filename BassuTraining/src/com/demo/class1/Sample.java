package com.demo.class1;

import com.demo.access.AccessPrivate;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEid(10);
		e.setEname("Anurag");
		e.setEsal(1000.50);
		
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsal());
		AccessPrivate ap = new AccessPrivate();
		ap.testDefault();
		ap.testPrivate();
		ap.testProtected();
		ap.testPublic();


	}

}
