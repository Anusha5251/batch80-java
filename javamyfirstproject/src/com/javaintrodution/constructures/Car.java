package com.javaintrodution.constructures;

public class Car {
	String model;
	String brand;
	double price;
	String color;
	
	Car(){
		System.out.println("no arg constructor called:");
	}
	
	public Car(String model) {
		this(model,"unknown");
	}
	
	public Car(String model,String brand) {
		this(model,brand,100000.00);
		
	}
	
	public Car(String model, String brand, double price) {
		
		this(model,brand,price,"unknown");
		
		
	}
	

	public Car(String model, String brand, double price, String color) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	

	

	public static void main(String[] args) {
		System.out.println("parameterized constructor called:");
		Car c=new Car();
		Car c1=new Car();
		

	}
		void carinfo() {
		System.out.println("model of the car is:"+model);
		System.out.println("model of the car is:"+brand);
		System.out.println("model of the car is:"+price);
		System.out.println("model of the car is:"+color);



	}

}
