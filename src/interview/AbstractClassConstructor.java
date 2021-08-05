package interview;

abstract class Bacchi
{
	int a;
	
	Bacchi(int a)
	{
		System.out.println("abstract class constructor "+a);
		this.a =a;
	}
	
}

public class AbstractClassConstructor extends Bacchi
{

	AbstractClassConstructor() 
	{
	super(5);
	System.out.println("default contrs");
		
	}
	
    public static void main(String[] args) {
		
		AbstractClassConstructor chi = new AbstractClassConstructor();

	}

	
}

/*OUTPUT:
   abstract class constructor 5
   default contrs
 
 */

