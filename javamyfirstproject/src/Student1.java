
public class Student1 {
	int studentid;
	String studentname;
	String course;
	
	Student1(int studentid,String studentname,String course){
		this.studentid=studentid;
		this.studentname=studentname;
		this.course=course;
	}
	Student1(Student1 s){
		this.studentid=s.studentid;
	    this.studentname=s.studentname;
	    this.course=s.course;
		
	}

	public static void main(String[] args) {
		Student1 s=new Student1(101,"anusha","java");
		s.display();
		Student1 s1=new Student1(s);
		s1.studentid=102;
		s1.display();
		}
	void display() {
		System.out.println("studentid:" + studentid);
		System.out.println("studentname:"+studentname);
		System.out.println("Studentcourse:"+course);
		System.out.println("*******************");
	}

}
