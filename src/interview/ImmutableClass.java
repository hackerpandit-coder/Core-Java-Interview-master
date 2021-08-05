package interview;

public class ImmutableClass {

	public static void main(String args[]){
		
			Mazdoor m1 = new Mazdoor("Rohit",45);
		    Mazdoor m2 = new Mazdoor("Dhoni",07);
		
		  //Immmutable class content cannot be changed thats y setter is not allowed
		    m1=m2;
		    System.out.println(m1.getName());   //Dhoni
		    System.out.println(m1.getMobile()); //07
	}
}

final class Mazdoor{
	
	final String name;
	final int mobile;
	
	public Mazdoor(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	
	//Note: When variable is final by default only getters will come 

	public String getName() {
		return name;
	}
	
//If you write setter , you will get compile time error
//	public void setName(String name){
//		this.name=name;
//	}

	public int getMobile() {
		return mobile;
	}
	
	
}
