package com.ClassMethods;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		System.out.println("factorial of "+num+" is "+Factorial.fact(num));
	}

	private static int fact(int num) {
		int pro=1;
		for(int i=1;i<=num;i++)
		{
			pro=pro*i;
			
		}
		return pro;
	}

}
