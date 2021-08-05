package procedure.calling;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCallingExample 
{

	public static void main(String[] args) 
	{
		
		Connection con =null;
		CallableStatement stmt =null;
		
		try {
				 con =MySqlConnection.getConnection();
				 stmt = con.prepareCall("{call new_function(?)}");
			     stmt.setInt(1,4);
			     stmt.registerOutParameter(2,Types.VARCHAR);
			     stmt.execute();
			     String name=  stmt.getString(1);
			     System.out.println("EmployeeNAme "+name);
	    
		
		    }catch(Exception e)
			{
			    e.printStackTrace();	
			}

	}

}
