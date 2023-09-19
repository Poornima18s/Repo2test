package com.String;

public class testString {

	public static void main(String[] args) {
		String n="Poornima Athmaraman";
	int x=n.length();
		/*System.out.println(x);
	System.out.println(n.charAt(5));*/
	 for(int s=0;s<=x-1;s++) {
		 System.out.println(n.charAt(s));}
		/* System.out.println(n);
		 String z=n.trim();
		 System.out.println(z);*/
		 
		 String m="should succeed";
		String d=n.concat(m);
		 System.out.println(d);
		 boolean e=n.equals(m);
		 System.out.println(e);
		//boolean w= n.contains("raman");
		 //System.out.println(w);
		 int s=n.compareTo(m);
		 System.out.println(s);
		 
		 /*String p="POORnima AthmaRAMan";
				 boolean star=n.equalsIgnoreCase(p);
		 System.out.println(star);*/
	 String sun=m.replace("should", "must");
	 System.out.println(n+sun);
		 
	 }
	}
		

	


