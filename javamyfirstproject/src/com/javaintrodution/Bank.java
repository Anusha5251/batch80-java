package com.javaintrodution;

public class Bank {
	static String BankName;
	int acno;
	int balance;
	String accountholdername;
	void display()
	{
		System.out.println(" Account number: =" + acno);
		System.out.println(" Balance: =" + balance);
		System.out.println(" Account holder Name: ="  + accountholdername);
	}

		
	

	public static void main(String[] args) {
		BankName="SBI";
		System.out.println("Bank Name =" +BankName);
		
		Bank b=new Bank();
		b.acno=123456780;
		b.balance=20000;
		b.accountholdername="aabb";
		b.display();
		
				
		Bank b1=new Bank();
		b1.acno=223344578;
		b1.balance=25000;
		b1.accountholdername="abcd";
		b1.display();
		
		Bank b2=new Bank();
		b2.acno=354672189;
		b2.balance=30000;
		b2.accountholdername="abxy";
		b2.display();
		
		Bank b3=new Bank();
		b3.acno=166778397;
		b3.balance=40000;
		b3.accountholdername="pqrs";
		b3.display();
		
			

			
	
			
		
		
		
		
		
		
		
		

	}

}
