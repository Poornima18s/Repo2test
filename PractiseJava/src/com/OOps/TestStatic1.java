package com.OOps;

public class TestStatic1 {
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static int sub(int x,int y) {
		int z=x-y;
		return z;
	}

	public static void main(String[] args) {
		
		TestStatic1 TS1=new TestStatic1();
		int s=TS1.add(10,10);
		int d=TestStatic1.sub(30, 10);
		System.out.println(s);
		System.out.println(d);
		
		
		
		}

	}


