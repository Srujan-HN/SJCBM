package com.javabasics;

public class BasicLoops {

	public static void main(String[] args) {
		int a=1;//start
		while(a<4)//condition
		{
			System.out.println(a);
			a++;//updation
		}
		int b=4;
		do {
			System.out.println(b);
			b++;
		   }while (b<4);
		int i=1;
		for(i=1;i<=4;i++)
		{
			System.out.println("i:"+i);
		}
		//star patterns
		for(int c=1;c<4;c++)
		{
			System.out.println("***");
		}

	}

}
