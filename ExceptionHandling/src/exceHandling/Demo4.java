package exceHandling;

import java.util.Scanner;

public class Demo4 {

	String webTech[]= {"java","python","flex","salesforce","AWS"};
	String dataAnalysis[] = {"machine learning","big data","hadoop"};
	String frontEnd[] = {"angular","react","phone gap", " swift","flutter"};
	

	public static void main(String[] args) {
	
		Demo4 obj = new Demo4();
		System.out.println(" Enter the Tech Domain Name ");
		String domainName = new Scanner(System.in).nextLine();
		try {
			obj.getUserInput(domainName);
		}
		catch(InvalidTechDomainNameException e)
		{
			System.out.println(e);
		}
		
		System.out.println(" --- App close ----");
	}
	
	public void getUserInput(String domainName)throws InvalidTechDomainNameException
	{
	
		if(domainName.equals("web"))
		{
			printTechnologies(webTech);
		}
		else if(domainName.equals("data"))
		{
			printTechnologies(dataAnalysis);
		}
		else if(domainName.equals("ui"))
		{
			printTechnologies(frontEnd);
		}
		else
		{
			InvalidTechDomainNameException domainException = new InvalidTechDomainNameException("No such Technology Domain List :- "+domainName);
			throw domainException; 
			// if we are throwing any checked Exception , then we have to add Same exception through throws clause
		}
		
		
	}
	
	public void printTechnologies(String arr[])
	{
		for (String techName : arr) {
			System.out.println(techName);
		}
	}
}
