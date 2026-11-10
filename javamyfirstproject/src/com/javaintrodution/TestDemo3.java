package com.javaintrodution;

public class TestDemo3 {
	 static TestDemo3 t3=new TestDemo3();

	 static {
		 System.out.println("stack block called1");
	 }
	 {
		 System.out.println("instance block called");
	 }

	public static void main(String[] args) {
		System.out.println("main mathod started");
		TestDemo3 t3=new TestDemo3();

		
		
		
		System.out.println("main mathod ended");
}
	static {
		System.out.println("static block called2");
	}
	

}
