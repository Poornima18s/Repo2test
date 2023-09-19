package com.OOps;

class Person {
	int id;
	String name;
 Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp1 extends Person {
	 float salary;
 Emp1(int id,String name,float salary){
	super(id,name);
	this.salary=salary;
	}
	public void display() {
		System.out.println(id+" "+name+ " "+salary);
	}
}

public class TestSuper3 {
    public static void main(String[] args) {
    	Emp1 E1=new Emp1(9008,"Poornima",10000f);
    	E1.display();
		
		

	}

}
