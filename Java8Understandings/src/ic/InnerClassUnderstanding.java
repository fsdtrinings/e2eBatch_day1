package ic;

public class InnerClassUnderstanding {

	public static void main(String[] args) {

		Car hondaCar = new Car();

		// Engine e = new Engine(); // not possible , compile time error

		// and business do not want to create sub class for Engine

		hondaCar.startCar(new Engine() {

			public int getPower() {
				return 1200;
			}
		});

	}
}
