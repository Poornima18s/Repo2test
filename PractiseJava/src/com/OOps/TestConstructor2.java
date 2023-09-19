package com.OOps;

public class TestConstructor2 {
	
	 int rollNum;
	 String name;
	 
//	 	TestConstructor2(int r,String n) {
//		 rollNum=r;
//		 name=n;
//		 
//		 }
	 	
	 	public void statement() {
	 		System.out.println(rollNum+ " "+name);
	 	}

	public static void main(String[] args) {
		
		//TestConstructor2 TC2=new TestConstructor2(111,"Rosy");
		TestConstructor2 TC2=new TestConstructor2();
		TC2.statement();
		
		 
		 

	}

}
