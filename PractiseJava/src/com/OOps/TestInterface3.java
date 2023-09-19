package com.OOps;

interface Animal{
	
	
	public void pig();
	public void cat();
	
}

public class TestInterface3 implements Animal {
	
	
	public void pig() {
		System.out.println("oink oink");
	}
	
	public void cat() {
		System.out.println("meow meow");
	}
	

	public static void main(String[] args) {
		TestInterface3 TI3=new TestInterface3();
		
		TI3.cat();
		TI3.pig();
	

	}

}
