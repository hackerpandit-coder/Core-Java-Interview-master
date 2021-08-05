package interview;

public class InterfaceDefination {
	public static void main(String[] args) {
		B b= new B();
		b.getDefaultMethod("Balmukund");
		b.getSalary("Balu");
		b.getSalaryInfo("adasdsa");
		B.getAddress(null);
		G.getAddress(null);
}}

interface G
{ // private Modifier is not used in interface
   String getSalaryInfo(String name);
   public abstract double getSalary(String name);
  // default is only allowed in interface
	default String getDefaultMethod(String empcode)
	{   System.out.println("getDefaultMethod- interface-"+empcode);
		return empcode;
	}
   public static String getAddress(String name)
	{   System.out.println("getAddress");
		return name;
	}
}

class B implements G
{
//	@Override
//	public String getDefaultMethod(String empcode)
//	{
//		System.out.println("Child B getDefaultMethod- impl-"+empcode);
//		return empcode;
//	}
	
	// Method Hiding Example
	public static String getAddress(String name)
	{   System.out.println("child  getAddress");
		return null;
	}
	
	@Override
	public double getSalary(String name) {
		System.out.println("Child B getSalary @Override");
		return 0;
	}
	@Override
	public String getSalaryInfo(String name) {
		System.out.println("Child B String getSalaryInfo @Override ");
		return null;
	}
//	public String getSalaryInfo(String name,String empcode) {
//		// This is overLoading 
//		System.out.println("Child B String getSalaryInfo");
//		return "";
//	}
	/*public int getSalaryInfo(String name,int empcode) {
		// This is overLoading 
		System.out.println("Child B int getSalaryInfo");
		return 0;
	}*/
}



