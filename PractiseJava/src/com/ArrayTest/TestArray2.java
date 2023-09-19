package com.ArrayTest;

public class TestArray2{
	
	public static void minimum(int arr[]){
		int minimum=arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(minimum > arr[i])
				minimum = arr[i];
		}
	
		System.out.println(minimum);
	}

	public static void main(String args[]){

		int a[] = {33,3,4,5};
		minimum(a);//passing array to method

	}
}

	 


