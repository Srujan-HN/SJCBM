package com.array.problems;

public class FindMax {

	public static void main(String[] args) {
		int [] arr= {5,1,17,3,19,14};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println("the max number is"+max);
		
	}

}
