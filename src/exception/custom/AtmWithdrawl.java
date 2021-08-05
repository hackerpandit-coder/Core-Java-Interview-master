package exception.custom;

import java.util.Scanner;

class Withdrawl
{
	
	public static void showMessage(int withdrawlamt)
	{
		int balance=10000;
		if(withdrawlamt>balance)
		{
			try {
					throw new InSufficientBalance("InSufficient Balance.........Please enter less amount ");
			    } catch (InSufficientBalance e)
				{
				
			    	e.printStackTrace();
				}
		}
		else
		{
			System.out.println("Please Take Cash");
		}
	}
	
}

public class AtmWithdrawl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to withdraw");
		int withdrawlamt=sc.nextInt();
		Withdrawl.showMessage(withdrawlamt);
		
	}

}
