package exceHandling;

import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		try {
			obj.doSomeWork();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	public void doSomeWork()throws SQLException
	{
		// some code to use SQL
	}

	/*
	 * throws clause enforce developer to 
	 * call the method from try and catch block
	 * otherwise it will be a compile time error
	 * */
}
