package com.javaintrodution;

public class Employee {
	static String companyName;
	int eId;
	String eName;
	String department;
	int salary;

	public static void main(String[] args) {
		companyName="infosys";
		System.out.println("companyName=" + companyName);
		Employee.companyName="TCS";
		System.out.println("companyName=" + Employee.companyName);  
		
		Employee emp = new Employee();
		emp.eId = 100;
		emp.eName = "bhumika";
		emp.department="java developer";
		emp.salary=20000;
		System.out.println("Employee eId=" + emp.eId);
		System.out.println("Employee eName=" + emp.eName);
		System.out.println("Employee department=" + emp.department);
		System.out.println("Employee salary=" + emp.salary);
		
		Employee emp1= new Employee();
		emp1.eId = 101;
		emp1.eName = "deepika";
		emp1.department="frontend developer";
		emp1.salary=25000;
		System.out.println("Employee eId=" + emp1.eId);
		System.out.println("Employee eName=" + emp1.eName);
		System.out.println("Employee department=" + emp1.department);
		System.out.println("Employee salary=" + emp1.salary);
						
		Employee emp2= new Employee();
		emp2.eId = 102;
		emp2.eName = "rangammma";
		emp2.department="backend  developer";
		emp2.salary=25000;
		System.out.println("Employee eId=" + emp2.eId);
		System.out.println("Employee eName=" + emp2.eName);
		System.out.println("Employee department=" + emp2.department);
		System.out.println("Employee salary=" + emp2.salary);
						
		Employee emp3= new Employee();
		emp3.eId = 105;
		emp3.eName = "anii";
		emp3.department="backend  developer";
		emp3.salary=30000;
		System.out.println("Employee eId=" + emp3.eId);
		System.out.println("Employee eName=" + emp3.eName);
		System.out.println("Employee department=" + emp3.department);
		System.out.println("Employee salary=" + emp3.salary);
						
				
		
		
		
		
		

	}

}
