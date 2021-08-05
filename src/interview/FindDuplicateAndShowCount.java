
package interview;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateAndShowCount {

	public static void main(String[] args)
	{
		Integer a=null;
		Integer b=0;
		
		Boolean c= null;
		Boolean d=false;
		
		// Its Time Complexity is O(2n)
		HashMap<String,Integer> mapDupli = new HashMap<>();
		
		String nameArr[]={"RAHUL","ajinkya","RAHUL","Dhoni","Dhoni","Jadeja","Abcd","Jadeja","RAHUL"};
		
		for(String name:nameArr)
		{
			System.out.println(name);
			Integer count = mapDupli.get(name);
			System.out.println(count);
			if(count==null)
				mapDupli.put(name, 1);
			else{
				count++;
				mapDupli.put(name, count);
			}
		}
		System.out.println(mapDupli);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		HashSet<String> hashset = new HashSet<String>();
		
		for(String name :nameArr){
			
			if(hashset.add(name)==false)
				System.out.println("--Hashset Duplicates---"+name);
		}
		
	}
}




