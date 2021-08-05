package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonExistingKeyPassed {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("batit", "bms");
		map.put("Raju", "wwww");
		String val = map.put("amit", "Raj");

		System.out.println("--When New Key is store in map.put in HashMap it returns----" + val);
		String val1 = map.put("amit", "RajaBeta");

		System.out.println("--When Exisiting Key is store in map.put in HashMap it returns--previous value--" + val1);

		map.put("Adarsh", "zzzz");
		map.put("Baju", "yyyy");

		System.out.println("Non exisitng key passed to kya hoga----" + map.get("bms"));

		TreeMap<String, String> tree = new TreeMap<>(map);

		for (Map.Entry<String, String> o : tree.entrySet()) {
			System.out.println(o.getKey() + "   " + o.getValue());
		}
		
		/*--  When New Key is store in map.put in HashMap it returns----null
			--When Exisiting Key is store in map.put in HashMap it returns--previous value--Raj
			Non exisitng key passed to kya hoga----null
			Adarsh   zzzz
			Baju   yyyy
			Raju   wwww
			amit   RajaBeta
			batit   bms
		 * 
		 * */

	}

}
