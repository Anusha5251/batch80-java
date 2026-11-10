package com.javaintrodution;
import java.util.Scanner;

public class Employeesalary {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Employeesalary es=new Employeesalary();
		double bs=es.getBasicsalary();
		double  hra = es.gethostelrentallowence();
		double lta = es.getleavetravelassistence();
		double sa = es.getspecialallowance();
		double mc = es.getmeancoupons();
		double pf = es.getprovidentfund();
		double gt = es.getgratuity();
		double totalsalary=bs+hra+lta+sa+mc+ pf+gt;
		
		System.out.println("total salary:");
	}
		
    double getBasicsalary() {
	System.out.println("enter basic salary:");
	double  bs=sc.nextDouble();
	return bs;
}
    double gethostelrentallowence() {
    	System.out.println("enter hra");
    	double hra=sc.nextDouble();
    	return hra;
    }
    
    double getleavetravelassistence() {
    	System.out.println("enter lta");
    	double lta=sc.nextDouble();
    	return lta;
    }
    
    double getspecialallowance() {
    	System.out.println("enter special allowence");
    	double sa=sc.nextDouble();
    	return sa;
    	
    }
    double getmeancoupons() {
    	System.out.println("enter mean coupons");
    	double mc=sc.nextDouble();
    	return mc;
    	
    }
    double getprovidentfund() {
    	System.out.println("enter provident fund");
    	double pf=sc.nextDouble();
    	return pf;
    }
     
    double getgratuity() {
    	System.out.println("enter gratuity");
    	double gt=sc.nextDouble();
    	return gt;
    }

}
