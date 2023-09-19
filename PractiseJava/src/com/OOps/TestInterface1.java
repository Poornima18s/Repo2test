package com.OOps;



interface Print {
	
	public abstract void printing();
}

interface Types  {	
	
	public abstract void typing();
	
}

public class TestInterface1 implements Types,Print
{
	public void printing() 
	{
	System.out.println("I am Printing");
	}
	
	public void typing() 
	{
	System.out.println("I am typing");	
	}
	
public static void main(String[] args) {
		TestInterface1 TF1=new TestInterface1();
		TF1.printing();
		TF1.typing();

	}

}
