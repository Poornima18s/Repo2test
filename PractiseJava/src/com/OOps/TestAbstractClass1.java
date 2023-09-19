package com.OOps;

abstract class Vehicle{
	
	abstract void speed();
	public void gear() {
		
		System.out.println("gear changed safely");
	}

}
class Bike extends Vehicle{
	
	public void speed() {
		
		System.out.println("Bike Should go in 40km/hr max");
		
	
	}
}
class Car extends Vehicle{
	
	public void speed() {
	
		System.out.println("Car should go in 60km/hr max");
}
	
}

public class TestAbstractClass1 {

	public static void main(String[] args) {
		Vehicle TAC=new Bike();
		TAC.speed();
		TAC.gear();
		
		Vehicle TAC1=new Car();
		TAC1.speed();
		TAC1.gear();

	}

}

