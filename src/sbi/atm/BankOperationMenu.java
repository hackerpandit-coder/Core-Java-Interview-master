package sbi.atm;

import java.util.Scanner;

public class BankOperationMenu {
	
	Scanner sc = new Scanner(System.in);
	WithDrawal withDrawal =null;
	DepositAmount depositAmount=null;
	
	public void menuList()
	{
		System.out.println("Please Select The Option");
		System.out.println(" 1.Balance Enquiry  "+"  2.Withdrawl  "+"  3.Deposit   ");
		System.out.println();
		
		int transactionType =sc.nextInt();
		
		if(transactionType == 2)
		{
			withDrawal = new WithDrawal();
			System.out.println("Please Enter the amount");
			System.out.println();
			int withdrawlamt=sc.nextInt();
			withDrawal.isWithdrawable(withdrawlamt);
		}
		else if(transactionType == 3)
		{
			depositAmount = new DepositAmount();
			System.out.println("Please Enter the amount to be deposit");
			System.out.println();
			int depositamt=sc.nextInt();
			depositAmount.getDepositAmount(depositamt);
			
		}
		else if(transactionType==1)
		{
			WithDrawal withDrawal = new WithDrawal();
			int Available_Balance=withDrawal.availableBalance();
			System.out.println("Your Current Available Balance is Rs."+Available_Balance);
			System.out.println();
			System.out.println("Thank You for using SBI ");
			System.out.println();
			AtmFrontEnd.main(null);
		}
		else
		{
			System.out.println("Please Provide Proper input.........Thank You For Using SBI");
			System.out.println();
			AtmFrontEnd.main(null);
		}
	}
	
	
	
	
	

}
