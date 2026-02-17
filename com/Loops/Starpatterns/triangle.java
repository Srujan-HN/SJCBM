package com.Loops.Starpatterns;

public class triangle {

	public static void main(String[] args) {
		//original version
		int n=4,s=0;
		for(int i=1;i<=n;i++)
		{
			s++;
			for(int c=1;c<=s;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
