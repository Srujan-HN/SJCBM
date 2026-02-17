package com.javabasics;

public class ConditionalStatements {
	public static void main(String[] args) {
		//movie ticket using if condition
		int rs=100;
		if(rs>=100)
		{
			System.out.println(" Ticket Booked");
		}
		//driving licence using if-else condition
		int age=50;
		if(age>=18 && age<=65)
		{
			System.out.println("Eligible to get Driving licence");
		}
		else {
			System.out.println("not eligible to get Driving license ");
		}
		// marrage program using else if ladder
		int ma=40;
		if(ma>=22 && ma<=32)
		{
			System.out.println("in the range");
		}
		else if(ma<18)
		{
			System.out.println("below the range");
		}
		
		else {
			System.out.println("out of range");
		}
		//switch statement
		int a=10;
		int b=20;
		int c=3;
		switch(c) {
		case 1: System.out.println(a+b);
				break;
		case 2: System.out.println(a-b);
				break;
		default: System.out.println("invalid choice");
		}
		
		
		
		
				
	}

}
