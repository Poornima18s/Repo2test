package ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		String s[]= {"5,3,4,8,9"};
		try {
			s[6]=s[1];
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("welcome");

	}

}
