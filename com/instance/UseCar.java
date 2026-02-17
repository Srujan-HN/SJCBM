package com.instance;
class car{
	String brand;
	int speed;
	int milage;
	static int wheel=4;
	 void details() {
			System.out.println("Brand: "+brand+"\nspeed: "+speed+"\nmilage"+milage);

		}
}
public class UseCar {
	public static void main(String[] args) {
		System.out.println(car.wheel);
		car c=new car();
		c.brand="Creta";
		c.speed=230;
		c.milage=15;
		
		c.details();
		
	}
	
	

}
