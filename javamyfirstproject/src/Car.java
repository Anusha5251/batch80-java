
public class Car {
	String model;
	String brand;
	double price;
	String color;
	
	Car(){
		System.out.println("no arg constructor called");
		model="unknown";
		brand="unknown";
		price=100000.00;
		color="unknown";
	}
	Car(String model,String brand,double price,String color){
		System.out.println("parameterized constructor called");
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	public static void main(String[] args) {
		System.out.println("main method  called");
		
		Car c=new Car();
		c.carInfo();
		
		
		Car c1=new Car("sonet","Kia",100000.00,"Red");
		c1.carInfo();
		
		

	}
		void carInfo() {
			System.out.println("model of the car:"+model);
			System.out.println("brand of the car:"+brand);

			System.out.println("price of the car:"+price);

			System.out.println("color of the car:"+color);

		}

}
