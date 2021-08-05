package interview;

public class SwapWithOutThirdVariable {

	public static void main(String[] args) {
		
		
		int x=10;
		int y=20;
		
		x=x+y; //30
		y=x-y; //10
		x=x-y; //20
		
		System.out.println("X--"+x+" Y--"+y);
		
		
		String a="Balmukund";
		String b="Singh";
		System.out.println("-Before  a---"+a);
		System.out.println("-Before  b---"+b);
		System.out.println();
		a=a+b;
		System.out.println("-----a---"+a);
		System.out.println();
		System.out.println("-After a---"+a.substring(9,14));
		System.out.println("-After b---"+a.substring(0,9));
		
		

	}

}
