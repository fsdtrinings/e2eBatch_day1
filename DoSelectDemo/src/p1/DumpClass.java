package p1;

import java.util.ArrayList;

public class DumpClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(104);
		list.add(114);
		list.add(14);
		
		Object objArr[] = list.toArray();
		
		int x = Integer.parseInt(objArr[0].toString());
		System.out.println(x);
		
		
		
	}
}
