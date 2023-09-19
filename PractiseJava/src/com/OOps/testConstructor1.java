package com.OOps;

public class testConstructor1 {
	 
			String name;
		 public testConstructor1(){
			System.out.println("Hello World");
		}
		 public testConstructor1(String n){
				name=n;
			}
		 public void show() {
			 System.out.println(name);
		 }

	public static void main(String[] args) {
//testConstructor1 TC =new testConstructor1();
testConstructor1 TC1=new testConstructor1("Poornima");
TC1.show();
	}

}
