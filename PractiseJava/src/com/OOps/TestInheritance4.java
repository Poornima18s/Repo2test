package com.OOps;

interface Appliances {
	
	public void stove ();
	public void fridge();
	public void washer();
	
}


class homeModelA implements Appliances {
	public void stove () {
		System.out.println("Gas stove");
		}
	
	public void fridge() {
		System.out.println("Whirpool");
		}
	public void washer() {
		System.out.println("LG");
		}
	
}
class homeModelB implements Appliances {
	public void stove () {
		System.out.println("Electric stove");
		}
	
	public void fridge() {
		System.out.println("Samsung");
		}
	public void washer() {
		System.out.println("GE");
		}
	
}


public class TestInheritance4  {
	
	
public static void main(String[] args) {
	
		
	Appliances A=new homeModelA();
	Appliances B=new homeModelB();
	
	A.fridge();
	B.fridge();
	
		

	}
	

}
