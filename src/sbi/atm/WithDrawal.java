package sbi.atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WithDrawal {
	
	
	public void isWithdrawable(int withdrawlamt)
	{
		int Available_Balance =this.availableBalance();
		
		if( withdrawlamt >Available_Balance)
		{
			System.out.println("InSufficient Balance In your Account");
			System.out.println();
			System.out.println("Thank You for using SBI ");
			System.out.println();
			AtmFrontEnd.main(null);
		}else
		{
			this.withDrawMoney(withdrawlamt);
		}
	}
	
	
	public void withDrawMoney(int withdrawlamt)
	{
		String query="INSERT INTO mydb.sbi_atm_withdrawl(withdrawl_AMT,DEBIT_CREDIT,DATE)VALUES(?,?, CURDATE())";
		
		try(     Connection con=SbiSqlConnection.getConnection();
			     PreparedStatement ps=con.prepareStatement(query);
				
			)
			    {
					ps.setInt(1,withdrawlamt);
					ps.setString(2,"CREDIT");
					ps.executeUpdate();
					System.out.println("Amount Withdraw Successfully!!!!!!!!!!!!!!!!!");
					System.out.println();
					int Available_Balance =this.availableBalance();
					System.out.println("Current Available Balance in your Account is");
					System.out.println("Rs. "+Available_Balance);
					System.out.println();
					System.out.println("Thank You For Using SBI ATM");
					System.out.println();
					AtmFrontEnd.main(null);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				AtmFrontEnd.main(null);
			}
		
		
	}
	
	public int availableBalance()
	{
		
		String totalDeposit ="select sum(deposit_amt) Available_Balance from sbi_atm_deposit";
		String totalWithdrawl ="select sum(withdrawl_amt) Available_Balance from sbi_atm_withdrawl";
		
		int Total_Deposit=0;
		int Total_Withdrawl=0;
		int Available_Balance=0;
		
		try( Connection con=SbiSqlConnection.getConnection();
		     PreparedStatement ps=con.prepareStatement(totalDeposit);
			 PreparedStatement ps1=con.prepareStatement(totalWithdrawl);
			 ResultSet rs1=ps1.executeQuery();
			 ResultSet rs=ps.executeQuery();
			)
		    {
			while(rs.next())
			{
				Total_Deposit = rs.getInt(1);
//				System.out.println("Total_Deposit=="+Total_Deposit);
			}
			
			while(rs1.next())
			{
				Total_Withdrawl = rs1.getInt(1);
//				System.out.println("Total_Withdrawl=="+Total_Withdrawl);
			}
			
			Available_Balance = Total_Deposit -Total_Withdrawl;
//			System.out.println("Available_Balance==>"+Available_Balance);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			AtmFrontEnd.main(null);
		}
		return Available_Balance;
	}
	
	
	

}
