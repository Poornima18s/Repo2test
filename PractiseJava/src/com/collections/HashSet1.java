package com.collections;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> nice=new HashSet();
		nice.add("Happy");
		nice.add("Hurray");
		nice.add("Smile");
		nice.add("Joy");
		nice.add("Laugh");
		for(String Positive:nice) {
		System.out.println(Positive);
		}
		
		

	}

}
