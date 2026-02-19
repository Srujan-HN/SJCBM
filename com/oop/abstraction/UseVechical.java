package com.oop.abstraction;
abstract class vehical{
	
}
class Bike extends vehical{
	
}
class Car extends vehical{
	
}
class Lorry extends vehical{
	
}
public class UseVechical {
 
	public static void main(String[] args) {
		vehical v=new Bike();
		System.out.println(v);
		v=new Lorry();
		System.out.println(v);
        v=new Car();
        System.out.println(v);
        if (v  instanceof Bike) {
        	System.out.println("This is a bike");
        	Bike b=(Bike) v;
        	System.out.println(b);
			
		}
        if (v  instanceof Car) {
        	System.out.println("This is a Car");
        	Car c=(Car) v;
        	System.out.println(c);
			
		}
        if (v  instanceof Lorry) {
        	System.out.println("This is a bike");
        	Lorry l=(Lorry) v;
        	System.out.println(l);
			
		}

	}

}
