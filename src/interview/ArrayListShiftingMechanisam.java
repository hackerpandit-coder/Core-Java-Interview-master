package interview;

import java.util.ArrayList;

public class ArrayListShiftingMechanisam {

	public static void main(String[] args)
	{
		Final finall= new Final();
		finall.addd();
	}

}

class Final
{
	final static ArrayList<String> list1= new ArrayList<>();
	
	public void addd()
	{
		list1.add("dhoni");
		list1.add("jadeja");
		list1.add("ajinkya");
		list1.add("dhawan");
		System.out.println(list1);  //OutPut: [dhoni, jadeja, ajinkya, dhawan]
		
	//Tricky question--------------------------------------	
    //After remvoing of element shifting will take place--------
		String a= list1.remove(0);
		System.out.println("--list1.remove(0)--shifitng will take place-");
		System.out.println(list1); //OutPut: [jadeja, ajinkya, dhawan]
  
		String b=list1.remove(1);
		System.out.println("--list1.remove(1)--shifitng will take place-");
//		list1.re
//		list1.remove(3);
//		list1.remove(4);
		System.out.println(a); //dhoni
		System.out.println(b); //ajinkya
		System.out.println(list1); //Output: [jadeja, dhawan]
	}

	
	
}
