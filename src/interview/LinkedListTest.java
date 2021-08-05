package interview;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add("Bms");
		list.add(null);
		list.add(24);
		list.add(null);
		list.add("Bms"); // List mai duplicate allowed hai .....Linked list ussi
							// ka beta hai
		System.out.println("LinkedList values using add()");
		System.out.println(list); //[Bms, null, 24, null, Bms]
		System.out.println();
		list.set(0, "Balmukund");
		System.out.println("Replace value using set(int index ,Object o)");
		System.out.println(list); //[Balmukund, null, 24, null, Bms]
		System.out.println();
		list.add(0, "Singh");
		System.out.println("Adding value at index 0 by add(int index ,Object o)");
		System.out.println(list); //[Singh, Balmukund, null, 24, null, Bms]
		System.out.println();
		System.out.println("Using addFirst()");
		list.addFirst("Niyati");
		System.out.println(list);//[Niyati, Singh, Balmukund, null, 24, null, Bms]
		System.out.println();
		System.out.println("Using addLast()");
		list.addLast("Panda");
		System.out.println(list);//[Niyati, Singh, Balmukund, null, 24, null, Bms, Panda]
		System.out.println();
		System.out.println("Using getFirst()==>" + list.getFirst()); //Using getFirst()==>Niyati
		System.out.println();
		System.out.println("Using getLast()==>" + list.getLast()); // Using getLast()==>Panda
		System.out.println();
		System.out.println("Using removeFirst()==>" + list.removeFirst()); //Using removeFirst()==>Niyati
		System.out.println();
		System.out.println("Using removeLast()==>" + list.removeLast()); //Using removeLast()==>Panda
		System.out.println();
		System.out.println(list); // [Singh, Balmukund, null, 24, null, Bms]

	}

}
