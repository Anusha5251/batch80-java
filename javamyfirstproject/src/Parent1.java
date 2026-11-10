
public class Parent1 {
	int value=10;
}
class Child extends Parent1{
	int value=20;
	void show(){
		System.out.println("value");
		System.out.println("super.value");
	}

}
class Vcube{
	public static void main(String[] args) {
		Child obj=new Child();
		obj.show();
	}
}
