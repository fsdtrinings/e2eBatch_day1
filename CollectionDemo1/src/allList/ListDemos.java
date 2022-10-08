package allList;

import java.util.*;

class Account{}
class Dog{}


public class ListDemos {

	public static void main(String[] args) {
		
	//  Animal a = new Dog()
	//  Employee e = new Account();
		List mylist = new ArrayList<>();
		 
		mylist.add(10);
		mylist.add(20);
		mylist.add("hello");
		mylist.add(new Account());
		mylist.add(10.55);
		mylist.add(true);
		mylist.add(new Dog());
		
		System.out.println(mylist);
		
		System.out.println(mylist.get(3));
		
	}
}
