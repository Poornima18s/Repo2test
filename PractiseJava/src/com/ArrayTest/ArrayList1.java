package com.ArrayTest;
import java.util.*;

public class ArrayList1 {

	public static void main(String args[]) {
		ArrayList<String> Star=new ArrayList<String>();
		Star.add("Poornima");
		Star.add("Saravanan");
		Star.add("Rithi");
		Star.add("Harudra");
		Star.add("Harusha");
		System.out.println(Star.size());
		
//		for(String menu:Star) {
//			System.out.println(menu);
			
			for(int i = 0;i < Star.size();i ++) {
				System.out.println(Star.get(i));
			}
			
		}
	}


		

	
