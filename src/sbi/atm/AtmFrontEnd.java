package sbi.atm;

import java.util.Scanner;

public class AtmFrontEnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("............................Welcome to SBI.................");
		System.out.println();
		System.out.println("Kindly Swipe your Card");
		String user_name =sc.nextLine();
		EnterPinNumber enterPinNumber = new EnterPinNumber();
		enterPinNumber.pinValidation(user_name);
		

	}

}
