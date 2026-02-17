package com.ClassMethods;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int given=sc.nextInt();
		 boolean check=checkstrong(given);
		 if(check) {
			 System.out.println("its a strong numbers");
			
		 }
		 else {
			 System.out.println("its  not a strong numbers");
		 }
		
		

	}

	private static boolean checkstrong(int given) {
		int di=given;
		int output=0;
//		boolean status =true;
		while(given>0)
		{
			int digit=given%10;
			output=output+fact(digit);
			given=given/10;
			
		}
		return output==di;
	}

	private static int fact(int digit) {
		int prob=1;
		for(int i=1;i<=digit;i++) {
			prob=i*prob;
		}
		
		return prob;
	}

}
