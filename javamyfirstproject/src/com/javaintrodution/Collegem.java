package com.javaintrodution;

public class Collegem {
	static String collegeName;
	String studentName;
	int studentId;
	String branch;
	int semester;
	void diaplay()
	{
		int studentId=123;
		String studentName="xyz";
		System.out.println("studentId");
		System.out.println("studentName");
		
	}
	
		
	public static void main(String[] args) {
		collegeName="abc";
		System.out.println(collegeName);
		Collegem c=new Collegem();
		c.studentName="abd";
		c.studentId=123;
		c.branch="cse";
		c.semester=1;
		System.out.println(c.studentName);
		System.out.println(c.studentId);
		System.out.println(c.branch);
		System.out.println(c.semester);
		
		
		
	}
		

	}


