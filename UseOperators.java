package com.javabasics;

public class UseOperators {
public static void main(String[] args) {
	int n=3;
//	post :use value first  and then change in memory
	System.out.println(n++);
	System.out.println(n);
	int b=4;
	int c=b--;
	System.out.println(b);
	System.out.println("c:"+c);
	  
//	check a number is divisible by both 3 and 4
	
	System.out.println(3 ==0);
	System.out.println(3!=4);
	System.out.println(3!=3);
	System.out.println("Logical operators");
	System.out.println("AND (&&) ");
	System.out.println(true && true && false);
	System.out.println(true && true && true);
	System.out.println(false && true);
	System.out.println("==================");
	System.out.println("Or (||) ");
	System.out.println(false || true || false);
	System.out.println(true || false);
	System.out.println(false || false);
	System.out.println("==================");
    System.out.println("===============================");	 
    int age=25;
	  if(age>=22 && age<=32)
	  {
		  System.out.println("eligible for marrage");
	  }
	  else {
		  System.out.println("not eligible for marrage");
	  }

}
}
