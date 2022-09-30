package understanding;

public class StaticDemo {

	static int x = 10;
	String name = "Ramesh";
	
	static {
		System.out.println("Hello");  // A
	}
	
	StaticDemo()
	{
		System.out.println("Inside Contructor"); // C
	}
	public static void main(String[] args) {
		
		System.out.println("1"); // B
		StaticDemo obj = new StaticDemo();
		System.out.println("2"); // D
		
		//System.out.println(x);
		//System.out.println(obj.name);
		
	}
	
	static void doSomeWork()
	{
		//System.out.println(x);
		//System.out.println(name);
	}
	
	void someDifferntWork()
	{
	//	System.out.println(x);
	//	System.out.println(name);
	}
}
