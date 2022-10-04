package p1;

import java.util.Scanner;

public class GameLogic {

	String questions[] = new String[3];
	
	String options[][] = new String[3][4];
	
	int answer[] = {2,3,1};
	
	int amount[] = {1000,2000,3000};
	
	int winningAmount = 0;
	
	// set the data 
	public GameLogic() {
	
		setQuestion();
		setOptions();
	}
	
	public void setQuestion()
	{
		questions[0] = "1+1";
		questions[1] = "2+1";
		questions[2] = "3+1";
	}
	
	public void setOptions()
	{
		options[0][0] = "1";
		options[0][1] = "2";
		options[0][2] = "3";
		options[0][3] = "4";
		
		options[1][0] = "45";
		options[1][1] = "101";
		options[1][2] = "3";
		options[1][3] = "30";
		
		options[2][0] = "4";
		options[2][1] = "44";
		options[2][2] = "444";
		options[2][3] = "4444";
	}
	
	public void playGame()
	{
		for(int q=0;q<questions.length;q++)
		{
			System.out.println((q+1)+" "+questions[q]);
			
			int opNo = 1;
			for(String op:options[q])
			{
				if(opNo == 3) System.out.println("\n");
				System.out.print(opNo+"]  "+op+"\t");
				opNo++;
				
			}
			
			
			System.out.println("\n Enter User Answer :- ");
			int userAnswer = new Scanner(System.in).nextInt();
			
			if(userAnswer == answer[q])
			{
				System.out.println(" Correct Answer : ");
				System.out.println(" U Won "+amount[q]);
				winningAmount += amount[q];
				System.out.println(" Total amount "+(winningAmount));
			}
			else
			{
				System.out.println(" U Loose the Game ");
				System.out.println(" Total amount "+winningAmount);
				break;
			}
			
			System.out.println("____________________________________________________");
		}//end of for
		
		
	}//end of playGames
	
}//end class















