package com.oop.abstraction;
interface Prey{
	void run();
}
interface Predator{
		void hunt();
}
class Lion implements Predator{

	@Override
	public void hunt() {
		System.out.println("Lion hunts its prey");
		
	}
	
}
class Fish implements Predator, Prey{
	String type;

	public Fish(String type) {
		super();
		this.type = type;
	}

	@Override
	public void run() {
	System.out.println(type+"is a prey for Shark");
		
	}

	@Override
	public void hunt() {
		System.out.println(type+" hunts for small creatures");
	}
	
}

public class ImplementMultipleInheritance {

	public static void main(String[] args) {
//		Lion l=new Lion();
//		l.hunt();
//		Fish f=new Fish();
//		f.hunt();
//		f.run();
		Predator p=new Lion();
		p.hunt();
		
		Prey f=new Fish("Small Fish");
		f.run();
		
		Predator p2=new Fish("shark");
		p2.hunt();
				
		
	}

}
