package com.instance;
class Bikes{
	String brand;
	int speed;
	static int wheel=2;
	 void details() {
		System.out.println("Brand: "+brand+"speed: "+speed);

	}
	
	
}

public class Bike {

	public static void main(String[] args) {
		System.out.println(Bikes.wheel);
		Bikes b=new Bikes();
		b.brand="R15";
		b.speed=210;
		
		b.details();
		
		

	}

}
