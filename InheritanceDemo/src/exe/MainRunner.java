package exe;

import p1.Cat;
import p1.Dog;

public class MainRunner {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setWeight(12);
		dog.eatFood(1);
		dog.playGames();
		dog.playGames();
		dog.playGames();
		dog.playGames();
		dog.playGames();
		dog.playGames();
		dog.playGames();
		
		System.out.println(dog.getWeight());
	
		
		Cat cat = new Cat();
		cat.setWeight(10);
		cat.eatFood(1);
		cat.doHunt();
		
		System.out.println(cat.getWeight());
		
	}

}
