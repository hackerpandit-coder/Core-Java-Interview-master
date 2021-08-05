package interview;

import java.util.HashMap;
import java.util.Iterator;

public class SetInternalWorking {

	public static void main(String[] args) {
		HashSetApna service = new HashSetApna();
		service.adding("bms");
		service.adding("bms");
		service.adding("Bms");
		service.adding("null");
		service.adding("null");
		System.out.println(service.sizeApna());
		service.removing("bms");
		System.out.println(service.sizeApna());
	}
}

class HashSetApna {
	private static final Object PRESENT = new Object();

	private transient HashMap<Object, Object> map;

	// Important Constructor
	public HashSetApna() {
		map = new HashMap<>();
	}

	public boolean adding(Object o) {
		if (map.put(o, PRESENT) == null)
			return true;
		else
			return false;
	}

	public int sizeApna() {
		return map.size();
	}
	// HOw to remove element
	public boolean removing(Object o) {
		if (map.remove(o) == PRESENT) {
			System.out.println("True");
			return true;
		} else
			return false;
	}

	public Iterator<Object> iterator() {
		return map.keySet().iterator();
	}
}
