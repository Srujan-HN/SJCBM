package com.oop.polymorphism;

class A{
	A(){
		System.out.println("From A constructor");
	}
}
class B extends A{
	public B() {
		System.out.println("from b constructor");
	}
	
}

public class UseSuper {
public static void main(String[] args) {
	B obj= new B();
}
}
