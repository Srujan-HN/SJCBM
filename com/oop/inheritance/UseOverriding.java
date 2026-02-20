package com.oop.inheritance;
 class Parent{
	public void talent() {
	System.out.println("study hard to get job");

	}
}

class Child extends Parent{

	@Override
	public void talent() {
		
		System.out.println("work on your hobbey and enjoy your life");
	}
	
}
class Child3 extends Parent{

	@Override
	public void talent() {
		System.out.println("work hard and earn money");
	}
	
}

public class UseOverriding {
	
public static void main(String[] args) {
	Parent p=new Child3();
	p.talent();
	Parent p1=new Child();
	p1.talent();
	
	
	
}
}
