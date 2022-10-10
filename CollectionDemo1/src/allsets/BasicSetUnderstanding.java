package allsets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BasicSetUnderstanding {

	public static void main(String[] args) {

		BasicSetUnderstanding obj = new BasicSetUnderstanding();

		//obj.basicSets();
		// obj.setForStrings();

		obj.sortedSets();
	}// end of main

	public void basicSets() {
		Set<Integer> mySet = new HashSet<>(); // allows only unique values

		mySet.add(15); // 1
		mySet.add(105);// 2
		mySet.add(15); // removed
		mySet.add(105); // removed
		mySet.add(1); // 3
		mySet.add(1); // removed , or not allowed
		mySet.add(15); // not allowed
		mySet.add(11); // 4
		mySet.add(11); // not allowed
		mySet.add(2); // not allowed
		mySet.add(3); // not allowed
		mySet.add(4); // not allowed

		System.out.println(mySet);
		// System.out.println(mySet.size());
	}

	public void sortedSets() {

		Set<Integer> marks = new TreeSet<>();
		
		marks.add(4005);
		marks.add(4500);
		marks.add(1445);
		marks.add(145);
		marks.add(405);
		// got this marks set from some source
		System.out.println(marks);

		Set<String> strSet = new TreeSet<>();
		strSet.add("abc");
		strSet.add("aabc");
		strSet.add("aazc");
		strSet.add("bba");
		strSet.add("bac");
		strSet.add("dab");
		strSet.add("daab");
		
		
		
		System.out.println(strSet);
		
	}

	public void setForStrings() {

		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("Java Script");
		strSet.add("Java");
		strSet.add("java");
		strSet.add("Spring");

		System.out.println(strSet.size());
		System.out.println(strSet);

	}

}// end of class
