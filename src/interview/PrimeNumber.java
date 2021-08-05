package interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();

		for (int i = 1; i <= digit; i++) {

			if(isPrimeNumber(i))
			System.out.println(i + " Is Prime Number ?? " + isPrimeNumber(i));
		}

	}

	public static boolean isPrimeNumber(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
		}
		return true;

	}

}
