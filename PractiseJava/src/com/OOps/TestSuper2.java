package com.OOps;

 class Animal1 {
	public void eat() {
		System.out.println("eating snack");
	}
}
 class Dogs2 extends Animal1 {
	 public void eat() {
		 System.out.println("eating food");
	 }
	 public void bark() {
		 System.out.println("barking");
	 }
	 public void dayTime() {
		 eat();
		 bark();
		 super.eat();
	 }
 }
 class TestSuper2 {
 public static void main(String[] args) {
	 Dogs2 TS2=new Dogs2();
	 TS2.dayTime();
		

	}

}
