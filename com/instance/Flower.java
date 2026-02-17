package com.instance;
class flowers{
	String color;
	int petals;
	void purpose(String reason) {
		System.out.println("Color: "+color);
		System.out.println("Petals: "+petals);
		System.out.println(reason);
	}
}

public class Flower {

	public static void main(String[] args) {
	flowers f= new flowers();
	f.color ="red";
	f.petals=5;
	f.purpose("the beautiful flower");

	}

}
