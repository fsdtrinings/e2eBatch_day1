package maps;

import java.util.HashMap;
import java.util.Map;

public class MapBasicDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, Double> myMap = new HashMap<>();
		
		myMap.put(1, 55.66);
		myMap.put(2, 155.66);
		myMap.put(1, 505.66);
		
		
		System.out.println(myMap);
		
		Double result = myMap.get(20);// use to extract the value based on key
		//if(result != null)
		System.out.println(result);

		System.out.println(" ----------- iterate map ----------------------\n");
		for (Map.Entry<Integer, Double> oneEntry : myMap.entrySet()) {
			
			System.out.print("\nKey :- "+oneEntry.getKey());
			System.out.print("\t Value :- "+oneEntry.getValue()+" \n");
			
		}
		
		
		
	}

}













