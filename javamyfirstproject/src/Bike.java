
public class Bike {
	String model;
	String brand;
	double price;
	String color;
	
	Bike(){
		System.out.println("no arg constructor called");
		this("unknown");
	}
	
		public Bike(String model) {
		this(model,"unknown");
		
	}
	public Bike(String model,String brand) {
		this(model,brand,50000.00);
		
	}
	
	public Bike(String model,String brand,double price) {
		this(model,brand,price,"red");
	}
		public Bike(String model,String brand,double price,String color) {
			this.model=model;
			this.brand=brand;
			this.price=price;
			this.color=color;
		}
		
	public static void main(String[] args) {
		Bike b=new Bike();
		b.bikeInfo();
		
		Bike b1=new Bike("Fz-s");
		b1.bikeInfo();
		
		Bike b2=new Bike("FZ-s","yamaha");
		b2.bikeInfo();
	}
	void bikeInfo() {
		System.out.println("model of the bike:"+model);
		System.out.println("brand of the bike:"+brand);

		System.out.println("price of the bike:"+price);

		System.out.println("color of the bike:"+color);
		System.out.println("*****************************");



	}

}
