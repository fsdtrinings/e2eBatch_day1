package day2;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		
		int arr[] = {14,15,61,32,48,20};
		
		int noOfIteration = 1;
		int searchEle = new Scanner(System.in).nextInt();
		for(int x=0;x<arr.length;x++)
		{
			
			if( searchEle == arr[x])
			{
				System.out.println(noOfIteration);
			}
			noOfIteration++;
		}
		
		
	}
}
