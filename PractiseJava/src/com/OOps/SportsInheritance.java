package com.OOps;

class Sports{
	
	public void football() {
		System.out.println("watching");
	}
}

public class SportsInheritance extends Sports {
	
	public void basketBall() {
		System.out.println("Interesting");
	}

	public static void main(String[] args) {
		SportsInheritance SI=new SportsInheritance();
		
		SI.basketBall();
		SI.football();

	}

}
