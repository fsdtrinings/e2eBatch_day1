package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Source {

	public static void main(String[] args) {

		ArrayListOps obj = new ArrayListOps();

		// ----- object 1 ------
		ArrayList<Integer> listFor0 = obj.makeArrayListInt(4);
		for(int i = 0;i<4;i++)
		{
			listFor0.add(0);
		}
		doPrint(listFor0);

			
				
		// ----- objective 2 ------
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 25, 33, 28, 10, 12));
		list = obj.reverseList(list);
		doPrint(list);

		// ----- objective 3 ------
		list = obj.changeList(list,28,20);
		doPrint(list);

	}

	public static void doPrint(ArrayList<Integer> list) {
		for (Integer data : list) {
			System.out.print(data + " ");
		}
		System.out.println(" \n\n\n ");
	}

}
