package com.oop.inheritance;

 class father{
	 String property1="Home";
	 String property2="car";
	 
	 public void talent() {
		 System.out.println("Study hard and get job");
		}
 }
 
 class Son extends father{
	 
 }

public class UseFamily {

	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.property1);
		System.out.println(s.property2);
		s.talent();
	}

}
