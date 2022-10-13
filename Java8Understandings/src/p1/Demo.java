package p1;

import java.util.Arrays;
import java.util.List;

public class Demo {

	
	
	
	public static void main(String[] args) {
	
		List<String> allEmails = Arrays.asList("abc@gmail.com","bhvhg@yahoo.com",
				"dsfd@gami.com","dfgrt@linkedIn.com","dfef@capg.com");
				
		
		// HTNT Code .....
		String email = "abc@gmail.com";
		
		if(email.endsWith("gmail.com"))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("in valid");
		}
		
	}
	
	
	
}
