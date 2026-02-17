package com.Loops.Starpatterns;

public class SquareMatrix {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
			System.out.print("*");
		
		   System.out.println("@");
		   
			for(int i=1;i<=3;i++)
				System.out.print("*");
			
			   System.out.println("@");
				for(int i=1;i<=3;i++)
					System.out.print("*");
				
				   System.out.println("@");
		System.out.println("======================================");
        int n=5;
        for(int r=1;r<=n;r++)
        {
        	for(int c=1;c<=n;c++)
        	{
        		System.out.print("*");
        		
        	}
        	System.out.println("@");
        }
	}

}
