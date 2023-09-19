package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> details=new HashMap();
		details.put(100, "Ajay1");
		details.put(102, "Sanjay");
		details.put(101, "jay1");
		details.put(103, "jay2");
		details.put(104, "Ajay2");
		details.put(105, "Vijay");
		 for (Map.Entry<Integer, String> set :
             details.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
		

	}

}
}