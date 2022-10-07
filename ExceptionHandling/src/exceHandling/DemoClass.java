package exceHandling;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		
		String techName[] = {"java","python","machine learning","AWS","GCP"};
		String choice = "n";
		do {
		
			System.out.println("Enter the index number to get the Technology Name :- ");
			int index = new Scanner(System.in).nextInt();
			
			try {
				String userSelectedTechName = techName[index];
				
				System.out.println(" User Selected Tech Name "+userSelectedTechName);
				
				System.out.println(" Would u like to search more <y/n>");
				choice = new Scanner(System.in).nextLine();
			}
			catch (Exception e) {
				System.out.println(" Exception "+e);
			}
		
		
		
		
		}while(choice.equals("y"));
		System.out.println("---App closed----");
	}
}
