package allsets;

import java.util.HashSet;
import java.util.Set;

public class BasicSetUnderstanding {

	
	public static void main(String[] args) {
	
		BasicSetUnderstanding obj = new BasicSetUnderstanding();
		
		Set<Integer> mySet = new HashSet<>(); // allows only unique values 
		
		mySet.add(15); //1
		mySet.add(105);//2
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
		//System.out.println(mySet.size());
		
		
		//obj.setForStrings();
		
	}//end of main
	
	public void setForStrings()
	{
		
		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("Java Script");
		strSet.add("Java");
		strSet.add("java");
		strSet.add("Spring");
		
		System.out.println(strSet.size());
		System.out.println(strSet);
		
	}
	
	
}//end of class




















