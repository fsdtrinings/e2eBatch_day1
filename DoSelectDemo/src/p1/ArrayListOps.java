package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOps {

	
	public ArrayList<Integer> makeArrayListInt(int n)
	{
		return new ArrayList<>(n);
	}
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		ArrayList<Integer> newReverseList = new ArrayList<>();
		
		Object arr[] = list.toArray();
		
		
		
		int pickIndex = arr.length-1;
		int putIndex = 0;
		
		
		while(true)
		{
			int data = Integer.parseInt(arr[pickIndex].toString());
			newReverseList.add(putIndex,data);
			putIndex++;
			pickIndex--;
			
			if(pickIndex<0)
			{
				break; // all done
			}
		}
		
		
		return newReverseList;
	}
	
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int searchElement, int replaceElement)
	{
		Object arr[] = list.toArray();
		int i = 0; // the position where to insert
		ArrayList<Integer> newList = new ArrayList<>();
		
		
		while(true)
		{
			int element = Integer.parseInt(arr[i].toString());
			if(element == searchElement)
			{
				newList.add(i,replaceElement);
			}
			else
			{
				newList.add(i,element);
			}
			i++;
			if(i == arr.length)
			{
				break; // all done
			}
		}
		
		
		
		return newList;
	}

	

	
	
}
