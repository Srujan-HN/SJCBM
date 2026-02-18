package com.Loops.Starpatterns;

public class Hover_Pattern {

	public static void main(String[] args) {
		int space=-1;
		int star=7;
		for(int row=1;row<=5;row++)
		{
			space++;
			star-=2;
			for(int c=1;c<=space;c++) 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=star;c++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
