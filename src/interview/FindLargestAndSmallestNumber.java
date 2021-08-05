package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		
		
		Integer arr[]={10,20,0,45,5,-10,56,-20};
		
		List<Integer> list=Arrays.asList(arr);
		System.out.println("Before List Data--"+list);
		Collections.sort(list);
		System.out.println("After List Data--"+list);
		
		//Smallest Number will be at Zero index
		System.out.println("Smallest Number is =  "+list.get(0));
		
		//Largest Number will be at Last Index list.size()-1
		System.out.println("Largest Number is =  "+list.get(list.size()-1));
		

	}

}
