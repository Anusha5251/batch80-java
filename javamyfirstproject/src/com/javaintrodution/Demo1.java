package com.javaintrodution;

public class Demo1 {

	public static void main(String[] args) {
		
		

	}
	
	static
	{
		method2();
		System.out.println("method1 called");
	}
	 
	 
	static void method2()
	{
	 Demo1 d1=new Demo1();
	 d1.method3();
		
			System.out.println("method2 called");
		}

		
	void method3()
	{
		method4();
		System.out.println("method3 called");
	} 
	
	void method4()
	{
		System.out.println("method4 called");
	}


	
	
	 

	

}
