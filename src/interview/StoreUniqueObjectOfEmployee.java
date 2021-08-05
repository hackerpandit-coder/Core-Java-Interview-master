package interview;

import java.util.HashSet;
import java.util.Set;

public class StoreUniqueObjectOfEmployee {

	public static void main(String[] args) {

		Set<EmployeeModel> set = new HashSet<EmployeeModel>();
		
		/*
		 * HashSet has add(Object o) which return boolean value:
		 */
		
		EmployeeModel e1= new EmployeeModel("Bms", "24", "9225361825");
		EmployeeModel e2= new EmployeeModel("Bms", "24", "9225361825");
		
		
		boolean a1 = set.add(e1); 
		boolean a2 = set.add(e1);
		boolean a3 = set.add(e2);
		System.out.println(set.size() + " " + a1 + " " + a2+"    "+a3);
		System.out.println(set.toString());

	}

}

class EmployeeModel {
	private String name;
	private String age;
	private String mobileno;

	public EmployeeModel(String name, String age, String mobileno) {
		super();
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "EmployeeModel [name=" + name + ", age=" + age + ", mobileno=" + mobileno + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeModel other = (EmployeeModel) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (mobileno == null) {
			if (other.mobileno != null)
				return false;
		} else if (!mobileno.equals(other.mobileno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}