package exe;

import p1.Animal;
import p1.Dog;

public class Main2 {

	public static void main(String[] args) {
		
		/*Super class ref can have sub class object*/
		
		Animal a = new Dog();
		
		
		a.eatFood(0);
		a.setWeight(0);
		
		// a.playGames(); // gives you an error
		
		
		// Dog d = new Animal();
		
		
		
		
	}
}
