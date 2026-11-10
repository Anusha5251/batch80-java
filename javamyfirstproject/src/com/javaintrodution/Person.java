package com.javaintrodution;

class Trainer  {
	String name = "vcube";

    void display() {
        System.out.println("Person display");
    }
}
public class Person extends Trainer{
	   String name = "Trainer";

	    void show() {
	        System.out.println(super.name);
	        super.display();
	    }
	public static void main(String[] args) {
		Person p = new Person();
		p.show();
	}

}
