package p1;

import java.util.Random;

public class StartGame {

	public static void main(String[] args) {
		
		//new GameLogic().playGame();
		
		 int arr[] = new KBCGame().getRandomNumber();
		
		 for(int i = 0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
}
