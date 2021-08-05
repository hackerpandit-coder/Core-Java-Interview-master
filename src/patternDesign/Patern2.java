package patternDesign;

import java.util.Scanner;

public class Patern2 {
	
	private static Scanner sc;

	public static void main(String []args)
	{
			int i,j;
			sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n-i;j++)
				{
					System.out.print("");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print("#");
				}
				
			} System.out.println();
			
			
	}

}


