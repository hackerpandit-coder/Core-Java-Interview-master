package interview;

import java.util.HashMap;
import java.util.Map;

public class HashMapModificationException {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i =10 ;i>0;i--){
			map.put(i,i);
		}
		System.out.println("--The End---"+map);
		
		 map.forEach((k,v) ->{ 
			 map.remove(k);
			 System.out.println("Key = "+ k + ", Value = " + v);
			 }
		 ); 
		 
		 /* Exception in thread "main" java.util.ConcurrentModificationException
	                                at java.util.HashMap.forEach(Unknown Source)
	                                at interview.HashMapModificationException.main(HashMapModificationException.java:17)
		  * */

	}

}
