package com.javaintrodution;

public class Student {
	int student_Id=101;
	String student_name="bhumika";
	String course_name="jfs";
	int marks=100;
	 static String college_name="vkr";
	 static String principal_name="murali";
	 
		
			void displayStudentdetails() {
			Student s1=new Student();
			s1.student_Id=101;
			s1.student_name="bhumika";
			s1.course_name="jfs";
			s1.marks=100;
			System.out.println("STUDENT DETAILS");
			System.out.println("student Id:" + s1.student_Id);
			System.out.println("student name:" +s1.student_name);
			System.out.println(" student course:" +s1.course_name);
			System.out.println("marks:" + s1.marks);
			
			void displayCollegeDetails() {
				System.out.println("college name:" +college_name);
				
				
			
			
				
			}
			
			
			
			
			
	
	

	public static void main(String[] args) {
		
		}
		
	 

	}

}
