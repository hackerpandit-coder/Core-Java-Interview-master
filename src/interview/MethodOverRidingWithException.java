package interview;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent1 {
	
	/*  If the superclass method does not declare an exception,
	    subclass overridden method cannot declare the checked exception but
	    can declare unchecked exception.
	*/
	public void saveData(){
		System.out.println("parent");
	}
	
	/*  If the superclass method declares an Checked or Unchecked exception, subclass overridden method can declare same,
	 *  subclass exception or no exception but cannot declare parent exception.
	 *  Only RunTimeException is allowed in this case
	 *  
	 *  Any Method who call this method who is going to throw exception
	 *  then calling method should handle with Try and catch
	 */
	public void getMethod() throws FileNotFoundException{
		System.out.println("-----FileNotFoundException--In Parent");
	}
	
	/*In static method ,restriction in child class even though it is not overriding, It is method Hiding (Compiler say It is Inherited Methods)
	 * Things u cannot do:--
	 *  Parent      |    Child
	 *------------------------------------------------------------------
	 *  public      |    protected,private     Note: Compile Time Error
	 *  protected   |    private               Note: Compile Time Error
	 *  static      |    non -static           Note: Compile Time Error
	 * */
	
	/*Parent class has Object return type and child can have Object or String return type
	 * It throws Checked Exception
	 * */
	public Object getName() throws IOException{
		System.out.println("Checked Exception in Parent IOException");
		return "bms";
	}
	
	public static void addNumber(){
		System.out.println("---Parent--addNumber--");
	}
	
	protected static void multiplyNumber(){
		System.out.println("---Parent--multiplyNumber--");
	}
}

public class MethodOverRidingWithException extends Parent1 {
	
	// while overriding only unchecked exception are allowed here  ,dont write checked exception IOException,SQLException
	// RuntimeException is unchecked Exception
	@Override 
	public void saveData() throws RuntimeException {
		System.out.println("Child saveData");
	}
	
	//Same, SubClass Exception ,  No exception are allowed here
	@Override
	public void getMethod() throws RuntimeException {

		System.out.println("RuntimeException--child----");
	}
	
	/*Parent class has Object return type and child can have Object or String return type
	 * */
	@Override
	public String getName() throws RuntimeException {
		System.out.println("Checked Exception in Parent IOException1 and RuntimeException1 in child");
		return "bms";
	}
	
// In static method u cannot make protected here, It should be public only	
	public static void addNumber(){
		System.out.println("--addNumber--Child----");
	}
	
	protected static void multiplyNumber(){
		System.out.println("---multiplyNumber----child----");
	}
	

	public static void main(String[] args) {

		Parent1 m = new MethodOverRidingWithException();
		try {
			  //Any Method who call this method who is going to throw exception
			  //  then calling method should handle with Try and catch
			  m.getMethod();
		    }
		    catch (IOException e) {
			e.printStackTrace();
		}
		m.saveData();
		m.addNumber();
		m.multiplyNumber();
		try {
			m.getName();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
