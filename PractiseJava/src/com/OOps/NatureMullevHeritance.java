package com.OOps;

class Earth{
	
	String E="living Creatures";
}

 class Ocean extends Earth {
	
	String O="Sea Creatures";
	
}
 class Forest extends Ocean {
	 
	 String F="Trees and living Creatures";
 }

public class NatureMullevHeritance extends Forest{

	public static void main(String[] args) {
		Forest N=new Forest();
		System.out.println(N.O);
		System.out.println(N.E);
		System.out.println(N.F);
		

	}

}
