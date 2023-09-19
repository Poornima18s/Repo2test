package com.String;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer SBF=new StringBuffer("Hello ");
		SBF.append("Poornima");
		System.out.println(SBF);
String x="Hello Poornima";
boolean w=SBF.equals(x);
System.out.println(w);
	}

}
