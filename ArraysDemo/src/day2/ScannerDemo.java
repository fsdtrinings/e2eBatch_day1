package day2;

// step 1 : to import scanner class from Util package
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		// step 2: create scanner class object // ignore object creation process
		// note : create saperate scanner object for String inputs
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter int value ");
		int x = sc.nextInt();
		System.out.println(" "+x);
		
		System.out.println("ENter float value ");
		float abc = sc.nextFloat();
		System.out.println(" "+abc);
		
		System.out.println("enter name :- ");
		
		Scanner strSc = new Scanner(System.in);
		String name = strSc.nextLine();
		System.out.println("--->> name "+name);
		
		
		
		
	}

}
