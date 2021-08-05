package interview;

public class ReverseStringOrPalindrome {

	public static void main(String[] args) {

		//TO reverse String
		String name="balmukund";
		String rev="";
		for(int i=name.length()-1 ; i>=0 ;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("--Reverse String--is---"+rev);
		
		
        //Palindrome		
		String palin="radar";
		String rev1="";
		
		for(int i=palin.length()-1 ; i>=0 ;i--)
		{
			rev1=rev1+palin.charAt(i);
		}
		System.out.println("--Palindrome--is---"+rev1);
		
		
		//To reverse number
		int number=123456;
		int ulta=0;
		
		while(number!=0){
			ulta=ulta*10+number % 10;
			number=number/10;
		}
		System.out.println("--ulta---"+ulta);
		
		//Reverse String
		String s = "Virendra";
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		System.out.println(s1);
				
	}

}
