package sbi.atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class EnterPinNumber {
				
	BankOperationMenu menu=null;
	Scanner sc = new Scanner(System.in);
	
	public void pinValidation(String user_name)
	{
		String userCheck="select count(user_name)  FROM SBI_ATM_PIN where user_name=?";
		String pinCheck ="select atm_pin  FROM SBI_ATM_PIN where user_name=?";
		int atm_pin =0;
		
		
		try(
				Connection	con = SbiSqlConnection.getConnection();
				PreparedStatement	ps1 = con.prepareStatement(userCheck);
				
				PreparedStatement	ps = con.prepareStatement(pinCheck);
				
		   )
		   {
			
				ps1.setString(1, user_name);
				ResultSet rs1 =ps1.executeQuery();
				int count=0;
				while(rs1.next())
				{
					count=rs1.getInt(1);
					
				}
				if(count!=1)
				{
					System.out.println("Please Swipe your Card Properly");
					System.out.println();
					AtmFrontEnd.main(null);
				}
								
				ps.setString(1, user_name);
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{
				   atm_pin= rs.getInt("atm_pin");
				}
				System.out.println("Enter the 6 digits Pin");
				int pinNumber= sc.nextInt();
			
				if(atm_pin==pinNumber)
				{
//					System.out.println("Your Pin Is correct");
					System.out.println();
					System.out.println();
					menu = new BankOperationMenu();
					menu.menuList();
					
				}
				else
				{
					System.out.println("Your Pin Is incorrect!!!!!!!!!!!!");
					System.out.println();
					System.out.println("Thank You For Using SBI ATM");
					System.out.println();
					AtmFrontEnd.main(null);
				}
			
		   }catch(Exception e)
		   {
			   e.printStackTrace();
			   AtmFrontEnd.main(null);
		   }
		
		
		
	}
	
	
	
	

}
