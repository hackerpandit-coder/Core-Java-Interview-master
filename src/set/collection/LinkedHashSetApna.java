package set.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetApna {
	
	static public void main(String abc[]){
		
	List<String>  list = new ArrayList<String>();
	list.add("David");
	list.add("Rahul");
	list.add("Xavier");
	list.add("Anil");
	list.add("abhijeet");
	list.add("Rahul");
	list.add("balu");
	list.add("Xavier");
	
	System.out.println(list);
	System.out.println();
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>(list);
	
	System.out.println(lhs);
	
	
	
	}

}
