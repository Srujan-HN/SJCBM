package com.oop.exceptions;
class A{
	int m=3;
}
public class CheckExpections {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3/0);
		System.out.println(4);
		System.out.println("==========");
		
		A obj=new A();
		System.out.println(obj.m);
	}

}
