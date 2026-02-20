package com.array.problems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 1, 19, 3, 17, 14};
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondMax) 
            {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest number=" + secondMax);
    }
}