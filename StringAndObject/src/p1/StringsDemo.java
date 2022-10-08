package p1;

public class StringsDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		
		String username = new String("ramesh");
		String nameInDatabase = new String("ramesh");
		
		boolean isSame = (username.equals(nameInDatabase));
		
		
		System.out.println(isSame);
		
		
	}
}
