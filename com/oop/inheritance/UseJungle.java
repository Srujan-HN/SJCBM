package com.oop.inheritance;
class Animal{
	int leg;
	String sound;
	public Animal(int leg, String sound) {
		super();
		this.leg = leg;
		this.sound = sound;
	}
	@Override
	public String toString() {
		return "Animal [leg=" + leg + ", sound=" + sound + "]";
	}
}
class Tiger extends Animal{

	public Tiger(int leg, String sound) {
		super(leg, sound);
	}
	
}
class Kangaroo extends Animal{
	int hand;
	public Kangaroo(int leg, String sound,int hand) {
		super(leg, sound);
		this.hand=hand;
	}
	
}

public class UseJungle {

	public static void main(String[] args) {
		
		Animal s=new Animal(4,"meow");
		System.out.println(s);
		
		Animal a=new Tiger(4,"RORE");
		System.out.println(a);
		
		Animal aa=new Kangaroo(2, "Jummping Skills", 2);
		System.out.println(aa);
		
	}

}
