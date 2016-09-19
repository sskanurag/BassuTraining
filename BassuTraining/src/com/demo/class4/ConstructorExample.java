package com.demo.class4;

public class ConstructorExample {
	int i;
	public ConstructorExample(int i){
		if (i<1){
		i =10;
		}
		System.out.println("Hello again i am first"+i);
	}
	public void test(){
		System.out.println("Test"+i);
	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample(10);
		ce.test();
	}

}
