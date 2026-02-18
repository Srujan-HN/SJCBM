package com.instance;
class Buss{
	String name;
	String Type;
	int seats;
	int cost;
	String places;
 void about() {
	 System.out.println("Buss name:"+name+"\nBus Type:"+Type+
			 			"\nNumber of seats:"+seats+"\nCost of Ticket:"
			 			+cost+"\nRoute:"+places);
 }
	
}

public class UseBus {

	public static void main(String[] args) {
		Buss b= new Buss();
		b.name="IRAVAT";
		b.Type="Sleeper coach";
		b.seats=40;
		b.cost=1500;
		b.places="Via Chikkamangalure";
		b.about();

	}

}
