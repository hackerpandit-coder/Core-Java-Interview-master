package set.collection;

import java.util.HashSet;


public class HashSetUsingComparable {

	public static void main(String[] args) {
		HashSet<College> tree = new HashSet<>();
		
		tree.add(new College("Satish",24, 25000f));
		tree.add(new College("David",74, 4500f));
		tree.add(new College("Satish",24, 25000f));
		tree.add(new College("Banta",84, 34000f));
		tree.add(new College("Chutiya",34, 55000f));
		
			for(College emp : tree)
			{
				System.out.println(emp.toString());
			}	

	}

}
class College implements Comparable<College>
{
	private String name;
	private int id;
	private float salary;
	
	public College(String name, int id, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
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
		College other = (College) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(College o) {
		
		if(this.getId()>o.getId())
		{
			return -1;
		}
		else if(this.getId()==o.getId())
		{
			return 0;
		}
		return 1;
	}
	
}
