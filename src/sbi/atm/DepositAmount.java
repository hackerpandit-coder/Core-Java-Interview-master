package sbi.atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import procedure.calling.MySqlConnection;

public class DepositAmount {
	
	public void getDepositAmount(int depositamt)
	{
		String query="INSERT INTO mydb.sbi_atm_deposit(DEPOSIT_AMT,DEBIT_CREDIT,DATE)VALUES(?,?, CURDATE())";
				
		try(
				Connection con=SbiSqlConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(query);
			)
		   {
			ps.setInt(1,depositamt);
			ps.setString(2,"DEBIT");
	 int a =ps.executeUpdate();
			System.out.println("Amount Deposited Successfully!!!!!!!  "+a);
			System.out.println();
			
			WithDrawal withDrawal = new WithDrawal();
			int Available_Balance=withDrawal.availableBalance();
			System.out.println("Your Current Available Balance is Rs."+Available_Balance);
			System.out.println();
			System.out.println("Thank You for using SBI");
			System.out.println();
			AtmFrontEnd.main(null);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			AtmFrontEnd.main(null);
		}
		
		
	}

}
