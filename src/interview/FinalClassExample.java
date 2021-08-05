package interview;

public class FinalClassExample {
	
	public static void main(String a[]){
		
	final CollegeStudent cs1 = new CollegeStudent("bms",10);
	final CollegeStudent cs2 = new CollegeStudent("abc",12);
	cs1.name="bunty";
		cs1=cs2; // here u will get error
	
	}
	
	

}
class CollegeStudent{
	
	String name;
	int rollno;
	
	public CollegeStudent(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public CollegeStudent() {
		super();
	}
	
	
	
} 
