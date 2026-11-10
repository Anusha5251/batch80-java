package com.javaintrodution;
import java.util.Scanner;

public class Testmethod {
	
	void name() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your name:");
	    String yourname=sc.nextLine();
	    System.out.println("my name is:"+yourname);
	}


	public static void main(String[] args) {
		Testmethod t=new Testmethod();
		t.name();
		
		
		
		
		

	}

}
