package com.seleniumautomation.JavaSelenium;

public class ReverseStringTest1 {

	public static void main(String[] args) {
		String name="Poornima";
		String reversedString="";
		for(int i=name.length()-1;i>=0;i--) {
			
	reversedString=reversedString+name.charAt(i);
			}
		System.out.println(name);
		System.out.println(reversedString);

	}
}

;