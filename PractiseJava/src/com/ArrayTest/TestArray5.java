package com.ArrayTest;

public class TestArray5 {

	public static void main(String[] args) {
		int arr[]= {25,67,87,22,46};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
			}
			System.out.println("Largest element in the array");
			System.out.println(max);
		}

	}


