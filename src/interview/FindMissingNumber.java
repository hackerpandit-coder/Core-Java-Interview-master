package interview;

import java.util.Scanner;

public class FindMissingNumber {
	public static void main(String a[]){
		//Duplicate entry for single number
		int arr[]={1,2,3,4,10,6,7,8,9,10};
		for(int i=0;i<arr.length;i++){
			int j=i+1;
			if(j==arr[i]){
				
			}
			else{
				System.out.println("Value Expected="+j+"  Found="+arr[i]);
			}
			
		}
		/*  Value Expected=2  Found=9
			Value Expected=5  Found=10
			Value Expected=7  Found=3
		 * */
		findMissingNo();
	}
	
	public static void findMissingNo(){
		
		        //Missing number
				int missing[]={1,2,3,4,5,6,7,9,10};
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int counter=sc.nextInt();
				int initial=counter*(counter+1)/2;
				int finalNo=0;
				
				for(int a:missing)
					finalNo=finalNo+a;
				System.out.println(initial-finalNo);
	}

}
