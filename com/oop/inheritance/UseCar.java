package com.oop.inheritance;
class Car{
	String brand;
	int speed;
	String color;
	 public void specification() {
		 System.out.println("Brand:"+this.brand);
		 System.out.println("Speed:"+this.speed);
		 System.out.println("Car Color:"+this.color);
		
	}
		

}
class BMW extends Car{

	public BMW(String brand, int speed,String color) {
		super.brand=brand;
		super.speed=speed;
		super.color=color;
	}
	
	
}
class swift extends Car{

	public swift(String brand,int speed,String color) {
		super.brand=brand;
		super.speed=speed;
		super.color=color;
		
	}
	
}

public class UseCar {

	public static void main(String[] args) {
		Car c=new BMW("BMW100",440,"Blue");
		c.specification();
		
		Car c1=new swift("Swift Lxi",240,"Red");
		c1.specification();
		

	}

}
