package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String>  list = new ArrayList<String>();
		list.add("David");
		list.add("Rahul");
		list.add("Xavier");
		list.add("Anil");
		list.add("abhijeet");
		list.add("dharam");
		list.add("balu");
		list.add("lion");
		
		Collections.sort(list);
		
		System.out.println("Ascending ----"+list); //Ascending ----[Anil, David, Rahul, Xavier, abhijeet, balu, dharam, lion]

		Collections.reverse(list);
		
		System.out.println("Descending ----"+list); //Descending ----[lion, dharam, balu, abhijeet, Xavier, Rahul, David, Anil]
		
		List<Integer>  list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(5);
		list1.add(4);
		list1.add(57);
		list1.add(1);
		
		System.out.println(list1); //[10, 5, 4, 57, 1]
		
		Collections.sort(list1);
		System.out.println("Ascending ----"+list1); //Ascending ----[1, 4, 5, 10, 57]
		
		Collections.reverse(list1);
		
		System.out.println(list1); //[57, 10, 5, 4, 1]
		
		
		

	}

}
