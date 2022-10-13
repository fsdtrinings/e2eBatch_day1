package ic;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Car tataCar = new Car();
		tataCar.startCar(
				()->{
			return 2000;
				});
	}
	
	/*
	tataCar.startEngine(e1); // employee
	tataCar.startEngine(student); // student
	tataCar.startEngine("petrol engine"); // 
	*/
	
}
