package com.OOps;

interface Bank{
	
	public abstract float interest(); 
}

 class SBI implements Bank{
	public float interest() {
		return 9.10f;
	}
}
class PNB implements Bank{
		public float interest() {
			return 9.30f;
		}
}

public class TestInterface2 {

	public static void main(String[] args) {
		Bank B=new SBI();
		System.out.println(B.interest());
	}
		

	}


