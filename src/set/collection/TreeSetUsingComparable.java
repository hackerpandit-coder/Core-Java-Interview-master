package set.collection;

import java.util.TreeSet;

public class TreeSetUsingComparable {

	public static void main(String[] args) {
		
		TreeSet<Employee> tree = new TreeSet<>();
		
		tree.add(new Employee("Satish",24, 25000f));
		tree.add(new Employee("David",74, 4500f));
		tree.add(new Employee("Rohan",24, 65000f));
		tree.add(new Employee("Banta",84, 34000f));
		tree.add(new Employee("Chutiya",34, 55000f));
		
			for(Employee emp : tree)
			{
				System.out.println(emp.toString());
			}	

	}

}
class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	private float salary;
	
	public Employee(String name, int id, float salary) {
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
		Employee other = (Employee) obj;
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
	public int compareTo(Employee o) {
		
		if(this.getId()>o.getId())
		{
			return 1;
		}
		else if(this.getId()==o.getId())
		{
			return 0;
		}
		return -1;
	}
	
//	public void display()
//	{
//		System.out.println();
//	}
//	
	
}
