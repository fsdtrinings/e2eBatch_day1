package stream;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,5,7,14,8);
		/*
		stream.forEach(new Consumer<Integer>() {
			int sum = 0;
			@Override
			public void accept(Integer t) {
				sum = sum + t;
				System.out.println(t);
				System.out.println("Sum :- "+sum);
			}
			
			
		});
		*/
		
		/*
		int result = stream.max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
			
		}).get();
		System.out.println(" Max number is "+result);
		*/
		
		int result = stream.max((o1,o2)->o1-o2).get();
		//System.out.println(result);
		// ------------------------------------------------------------
		/*
		List<Integer> myList = Arrays.asList(14,5,2,3,69,75,10,36,66,39,78,28,82,87);
		 //40-60
		
		
		List<Integer>  list2 = new ArrayList<>();
		for (Integer ele : myList) {
			
			if(ele>=40 && ele<=90)
			{
			
				list2.add(ele);
			}
		}
		System.out.println(list2);
		*/
		// ----------------------------------------------------------------
		
		List<Integer> myList = Arrays.asList(14,5,2,3,69,75,10,36,66,39,78,28,82,87);
		myList.stream().filter(new Predicate<Integer>()
		{

			@Override
			public boolean test(Integer t) {
				return (t>=40 && t<=90)?true:false;
			}
			
		}).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
					System.out.println(t);
			}
		});
		
		System.out.println("------- OR ------ (write code through lambda operation)");
		
		myList.stream()
		.filter((t)->(t>=40 && t<=90)?true:false)
		.forEach((t)->System.out.println(t));
	
		
	}//end of main
}//end of class
















