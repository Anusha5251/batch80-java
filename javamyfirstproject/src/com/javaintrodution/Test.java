package com.javaintrodution;

public class Test {

	public static void main(String[] args)  throws ClassNotFoundException {
		System.out.println(Class.forName("com.javaintrodution.Welcome"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
         
	}

}
