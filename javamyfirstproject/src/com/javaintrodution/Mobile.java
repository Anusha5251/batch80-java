package com.javaintrodution;
class Product{
	String model;
	String brand;
	double price;
	String color;
    Product(String model,String brand,double price,String color) {
    	this.model=model;
    	this.brand=brand;
		this.price=price;
		this.color=color;
		System.out.println("no-arg constructor called product");
		
	}
    Product(String model,String brand){
    	this.model=model;
    	this.brand=brand;
    	System.out.println("no-arg constructor called product");
    }
		
    }
	public class Mobile extends Product {
		Mobile(){
			super("ipx","samsung",20000,"blue");
			System.out.println("no-arg constructor called product");

		}
		Mobile(String model,String brand){
			super(model,brand);
			super.model=model;
			super.brand=brand;
		System.out.println("no arg constructor called customer");
		
	}



	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.mobileInfo();
		Mobile m1=new Mobile("14promax","google");
		m1.mobileInfo();
			
				
	}
	void mobileInfo() {
	System.out.println("model name of the mobile:"+model);
	System.out.println("brand name of the brand:"+brand);
    System.out.println("price of the mobile:"+price);
    System.out.println("color of the mobile:"+color);
	}
	}


