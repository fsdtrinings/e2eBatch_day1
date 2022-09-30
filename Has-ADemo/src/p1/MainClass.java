package p1;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	Car allCars[] = new Car[1515151];
	int noofCars = 0;

	String allColors[] = {"white","black","red","silver","gray","blue"};
	
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass app = new MainClass();

		while (true) {
			System.out.println(" -- Car Menu ---");
			System.out.println("1. add Car ");
			System.out.println("2. Display All Car ");
			System.out.println("3. Edit Engine Details ");
			System.out.println("4. View Engine Details ");

			System.out.println("0. Exit ");

			System.out.println("Enter ur choice :- ");

			switch (app.sc.nextInt()) {

			case 1:
				app.addCar();
				break;
				
			case 2:
				app.viewCarDetails();
				break;
				
			case 3:
				app.changeEngine();
				break;
				
			case 4:
				app.viewCarEngineDetails();
				break;
				
		

			default:
				System.out.println("Exit ");
				System.exit(0);
			}//end of switch

		}//end of while

	}//end of main

	public String getRandomColor()
	{
		Random myRandom = new Random();
		int index = myRandom.nextInt(6);
		
		if(index>=0 && index<=5)
		{
			return allColors[index];
		}
		else
		{
			getRandomColor();
		}
		return null;
	}
	
	
	public Car getCarById(int searchCarNumber)
	{
		for(int i = 0;i<noofCars;i++)
		{
			Car c = allCars[i];
			
			boolean isFound = (c.getCarNumber() == searchCarNumber)?true:false;
			
			if(isFound)
			{
				return c;
			}
			
		}
		return null;
	}
	
	public void viewCarEngineDetails() {
		System.out.println("Enter Searched Car Number  ");
		int searchCarNumber = sc.nextInt();
		
		Car c = getCarById(searchCarNumber);
		
		System.out.println(c.getE());

	}

	public void addCar() {
		
		Random myRandom = new Random();
		int carId = myRandom.nextInt();
		
		System.out.println("Enter Car Brand Name ");
		String brandName = scStr.nextLine();
		
		String carColor = getRandomColor();
		
		int engineId = myRandom.nextInt();
		
		System.out.println("Enter Engine Power ");
		int enginePower = sc.nextInt();
		
		System.out.println("Enter Engine Type ");
		String engineType = scStr.nextLine(); // 
		
		Engine e = new Engine(engineId, enginePower, engineType);
		Car c = new Car(carId, brandName, carColor);
		c.setE(e);
		
		allCars[noofCars++] = c;
		System.out.println(" "+c);
		System.out.println(" Added in the List ");
		
		
	}

	public void viewCarDetails() {
		System.out.println("Enter Searched Car Number  ");
		int searchCarNumber = sc.nextInt();
		
		Car c = getCarById(searchCarNumber);
		
		System.out.println(c);
	}

	public void changeEngine() {
		System.out.println("Enter Searched Car Number  ");
		int searchCarNumber = sc.nextInt();
		
		Car c = getCarById(searchCarNumber);
		
		System.out.println(" --- Store Details ---");
		System.out.println(c.getE());
	
		System.out.println(" ---- Enter New Engine Details ---- ");
		
		System.out.println("Enter Engine Power ");
		int enginePower = sc.nextInt();
		
		System.out.println("Enter Engine Type ");
		String engineType = scStr.nextLine(); // 
		
		
		/*  code to update the details */
		// 1st get the engine of the car
		// 2nd enter (set) new values
		c.getE().setPower(enginePower);
		c.getE().setEngineType(engineType);
		
		System.out.println(" --->> New Car after updation :- ");
		System.out.println(c);
		
	
	}

}
