package com.OOps;

class Dogs1 {
	String color="White";
}
	
 class Super1 extends Dogs1{
	String color="Black";
	public void animal() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
 class TestSuper1 {
	public static void main(String[] args) {
		Super1 D1=new Super1();
		 D1.animal();
		
		

	}
}



