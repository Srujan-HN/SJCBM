package com.oop.polymorphism;
class Parent{
	int age;

	public Parent(int age) {
		super();
		this.age = age;
		System.out.println("parent() is done");
	}
	
}
class Child extends Parent{

	public Child(int age) {
		super(age);
		System.out.println("Child() is done");
	}
	
	
}
public class TestSuper {

	public static void main(String[] args) {
		Child c= new Child(25);
		System.out.println(c.age);

	}

}
