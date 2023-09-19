package exercise;

public class test1 {

	public static void main(String[] args) {
		String name="Poornima";
		int f=name.length()-4;
	
		
		for(int i=0;i<4;i++) {
			//System.out.println(name.charAt(f));
			char up=Character.toUpperCase(name.charAt(f));
			System.out.println(up);
				f++;
				
				System.out.println("Welcome");
				
		}

	}
}

