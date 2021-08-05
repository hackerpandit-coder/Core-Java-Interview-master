package sbi.atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import procedure.calling.MySqlConnection;

public class MainMethod {

	public static void main(String[] args) {
		
				
		String query ="select atm_pin  FROM SBI_ATM_PIN where user_name=?";
		int atm_pin =0;
		int pinNumber=241093;
		String user="BALMUKUND";
		
		
		try(
				Connection	con = SbiSqlConnection.getConnection();
				PreparedStatement	ps = con.prepareStatement(query);
				
		   )
		   {
				ps.setString(1,user);
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{
				   atm_pin= rs.getInt(1);
				}
			
				if(atm_pin==pinNumber)
				{
					System.out.println("Your Pin Is correct");
					System.out.println();
					System.out.println();
//					menu = new BankOperationMenu();
//					menu.menuList();
					
				}
				else
				{
					System.out.println("Your Pin Is incorrect!!!!!!!!!!!!");
					System.out.println();
					AtmFrontEnd.main(null);
				}
			
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	}

}
