package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyDBConnection {
	Connection con; // object which holds the connection between our code & database
	String serverAddress = "jdbc:postgresql://localhost:5432/postgres"; // server addressof postgres
	String username = "postgres"; // username
	String password = "pgadmin"; // password
	
	public MyDBConnection()throws Exception {
		
	
	         Class.forName("org.postgresql.Driver");
	         con = DriverManager
	            .getConnection(serverAddress,username, password);
	  //       System.out.println("con "+con);
	      
	     // System.out.println("Opened database successfully");
	}
	
	public static void main(String[] args){
	
		try {
			new MyDBConnection().readData();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	
	}
	
	public void readData()throws Exception
	{
		String query = "select * from employee";
		PreparedStatement ps = con.prepareStatement(query); // statement used for executing the Query
		
		ResultSet rs = ps.executeQuery(); // statement use for loading the data from DB
		while(rs.next())
		{
			int empid = rs.getInt("empid");   // reading data one by one column
			int salary = rs.getInt("salary");
			String name = rs.getString("empname");
			String department = rs.getString("department");
			
			System.out.println(empid+" - "+name+" - "+salary+" - "+department);
			
		}
	}
	
}
