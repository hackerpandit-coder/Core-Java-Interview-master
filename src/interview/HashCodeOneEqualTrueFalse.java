package interview;

import java.util.HashMap;
import java.util.Map;

public class HashCodeOneEqualTrueFalse {

	public static void main(String[] args) {
		
		HashCodeOneEqualTrueFalse  test = new HashCodeOneEqualTrueFalse();
		test.stringCheck();
		
		Student sd1= new Student();
		Student sd2= new Student();
		System.out.println("-Default constructor-Student class object hashcode-----");
		System.out.println(sd1.hashCode()); //366712642
		System.out.println(sd2.hashCode()); //1829164700
		//Note: After Overriding Hashcode method  sd1 & sd2 will have same hashcode i.e 1
		//Now, equal method will check for content , right now it is default values by default constructor
		// i.e name=null, age=0, city=null that means sd1 & sd2 both have same content
		
		Student sd3= new Student("bms",24,"mumbai");
		Student sd4= new Student("bms",24,"mumbai");
		
		System.out.println("---------Studnet class object hashcode-----------");
		System.out.println(sd3.hashCode()); //2018699554
		System.out.println(sd4.hashCode()); //1311053135
		//Note: After Overriding Hashcode method  sd3 & sd4 will have same hashcode i.e 1
		
		HashMap<Student,String> map = new HashMap<Student,String>();
		map.put(sd1, "Ajinkya");
		map.put(sd2, "Bhumi");
		map.put(sd3, "Chintu");
		map.put(sd4, "Dinesh");
		System.out.println("--map size---"+map.size()); //--map size---1

	}
	
	@Override
	public String toString() {
		return "HashCodeOneEqualTrueFalse []";
	}

	// Note: The hash value of the empty string is zero.
	// Hashcode of string is calculated based on character assigned i.e Germany
	public void stringCheck()
	{
		String s="";
		String s1="Germany";
		String s2=new String("Germany");
		String s3=new String("Germany");
		
		System.out.println(s1.hashCode()); //1588421523 
		System.out.println(s2.hashCode()); //1588421523
		System.out.println(s3.hashCode()); //1588421523
		
		/*Now hashcode is same, equal method will check for content of s2 that is Germany.
		 * That means s1 and s2 hashcode are same and s1 and s2 content are same i.e Germany.
		 * thats'y it will over ride the value.
		 */
		Map<String,String>  map=new HashMap<>();
		map.put(s,"Amit");
		map.put(s1,"Amit");
		map.put(s2,"Bat");
		map.put(s3,"Chetan");
		map.put(s1,"Dinesh");
		System.out.println(map); //{ =Amit, Germany=Dinesh}
	}


}

class Student{
	
	String name;
	int age;
	String city;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
}
