package com.demo.class4;

public class StaticExample {
	static int k;
	int i;
	public void test(){
	System.out.println("Test Method"+k);	
	}
	public StaticExample()
	{
		if(i<1){
		i =10;
		}
		System.out.println("Constructor Method"+i);
	}
	static{
		k=100;
		System.out.println("Block Level"+k);
	}
public static void testStatic()
{
	k=200;
	System.out.println("Test Static Method"+k);
}
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		se.test();
		se.testStatic();

	}

}
