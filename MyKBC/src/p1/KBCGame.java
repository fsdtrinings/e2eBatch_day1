package p1;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class KBCGame {

	String simpleQuestions[] = new String[20];
	String simpleOptions[][] = new String[20][4];
	int simpleAnswer[] = new int[20];

	String difficultQuestions[] = new String[20];
	String difficultOptions[][] = new String[20][4];
	int difficultAnswer[] = new int[20];

	String vDifficultQuestions[] = new String[20];
	String vDifficultOptions[][] = new String[20][4];
	int vDifficultAnswer[] = new int[20];

	
	
	Set<Integer> allIndex = new HashSet<>();
	
	int amount[] = {1000,2000,3000};
	int winningAmount = 0;
	
	// set the data 
	public KBCGame() {
	
		
	}
	
	
	public void playGame()
	{
		
		
		
	}//end of playGames
	
	
	public int[] getRandomNumber()
	{
		Random random = new Random();
		
		while(true)
		{
			int indexNumber = random.nextInt(20);
			Set<Integer> set = makeUniqueNumbers(indexNumber);
			
			if(set.size() == 5)
			{
				int arr[] = new int[5];
				int p = 0;
				for (Integer x : set) {
					arr[p++] = x;
				}
				return arr;
			}
			else
			{
				continue;
			}
			
		}
		
	}
	
	public Set<Integer> makeUniqueNumbers(int i)
	{
		allIndex.add(i);
		return allIndex;
	}
	
}//end class















