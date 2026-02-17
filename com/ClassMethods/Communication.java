package com.ClassMethods;

public class Communication {
	public static void main(String[] args) {
		Communication.call("Anuskha","Prabhas");
		Communication.call("Rashmika","Vijay");
	}

 static void call(String heroine, String hero) {
	System.out.println("Heroine "+heroine+" is continuously talking with "+hero);
		
	}
}
