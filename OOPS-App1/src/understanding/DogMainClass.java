package understanding;

import java.util.Scanner;

public class DogMainClass {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);// for String input
		Scanner userInput2 = new Scanner(System.in); // for non string inputs
		
		
		System.out.println("Enter Dog name & age (resp.) :- ");
		
		Dog dog1 = new Dog();
		
		String dogNameFromUser = userInput.nextLine();
		dog1.setName(dogNameFromUser);
		
		int dogAgeFromUser = userInput2.nextInt();
		dog1.setAge(dogAgeFromUser);
		

		System.out.println(dog1.getAge());
		System.out.println(dog1.getName());
		
		
		System.out.println("Enter 2nd Dog  name & age (resp.) :- ");
		
		  Dog dog2 = new Dog(); 
		  
		  dog2.setName(userInput.nextLine());
		  dog2.setAge(userInput2.nextInt());
		  
		  System.out.println(dog2.getAge());
		  System.out.println(dog2.getName()); 
		 
		
		
		new Dog().setName("dwedfeg");
		
		
		
		
		
		
	}
}
