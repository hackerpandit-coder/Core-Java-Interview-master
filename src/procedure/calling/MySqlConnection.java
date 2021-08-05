package procedure.calling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection
{
	public static Connection getConnection()
	{
		java.sql.Connection con=null;

		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Asdf@1234");
			System.out.println("Connection Established");
			
		}catch(ClassNotFoundException e1)
		{
			System.out.println("Exception=="+e1.getMessage());
			e1.printStackTrace();
		}
		catch(SQLException e2)
		{
			System.out.println("SQLException=="+e2.getMessage());
		}
		
		return con;
	}
}
		
		
	


