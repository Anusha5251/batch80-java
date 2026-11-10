package com.javaintrodution;

public class Testliterarlasdemo {

	public static void main(String[] args) {
		int a=055;
		int a1=0x234;
		System.out.println(a);
		System.out.println(a1);


		float f=0123;
		float f1=0123.f; 
		float f2=0x123f;
		float f3=0123.5f;
		float f4=0b1010;
		
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		// decimal literals
		double d=0123;
		double d1=0123d;
		double d2=0123.5d;
		double d3=0x123d;
		double d4=0b1010;
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		
		//char literals
		char c = 'A';
		char c1 =65;
		
		
		Testliterarlasdemo t1=new Testliterarlasdemo();
		String s="java";
		String s1="java";
		System.out.println(s == s1);
		
		
		
		
		String s3=new String("vcube");
		String s4=new String("vcube");
		System.out.println(s3 == s4);
		
	
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);


	}

}
