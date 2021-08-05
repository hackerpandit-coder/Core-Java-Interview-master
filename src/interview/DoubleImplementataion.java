package interview;

public class DoubleImplementataion {

	public static void main(String[] args) {
		Girl boy = new Boy();
		boy.baba();
	}

}

interface Emp
{
	
	String findName();
	String name="Balmukund";
	int a=10;
}
interface Company
{
	String findName();
	int salary();
}
 
class Boy extends Girl implements Emp,Company 
{
	@Override
	public String findName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 0; 
	}
	@Override
	int babu() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String baba()
	{
		System.out.println(" Boy method baba");
		return "";
	}
	
}
abstract class Girl implements Emp,Company
{
	String a;
	public String baba()
	{
		System.out.println(" Girl method baba");
		return "";
	}
	
	abstract int babu();
}
