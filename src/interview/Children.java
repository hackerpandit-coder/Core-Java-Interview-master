package interview;

public class Children extends Parent
{
	String commonName;
	int childAge;
	
	public static void main(String[] args)
	{
	   /* dad is of Parent type ,but stores address of an object child(Children) 
	    * dad can only access Parent class variables and its method 
	    */
		Parent dad= new Children();
		/*Non static method hai child method called hoga 
		 *Static method hai to parent method called hoga 
		*/
		dad.add(null, null); //-Child--overiride bua--
		dad.commonName="Daddy"; //Only Parent variables appears here
		
		Children child = new Children();
		child.add(null,null); // child method only shows
		child.commonName="Bunty"; //Note : Only Children variables appears here
		child.show(null);
		child.show(10);
	}
	@Override
	
	public String add(String a,String b)
	{
		System.out.println("-Child--overiride bua--");
		return "";
	}
	
	
	protected Boolean methodChild(String a,String b)
	{
		System.out.println("-Child--override- hua-");
		return true;
	}

}
class Parent
{
	String commonName;
	int parentAge;
	//Note:  show(Object a) &&& show(String a)  .....String will get called
	//Note:  show(Object a) &&& show(Integer a) .....Integer will get called
	//Note:  show(String a) &&& show(Integer a) .....RuntimeException.......ambiguity
	public void show(Object a) {System.out.println("-Parent--Object--");}
//	public void show(String a) {System.out.println("-Parent--String--");}
	public void show(Integer a){System.out.println("-Parent--Integer--");}
	public void show(long a){System.out.println("-Parent--long--");}
	protected String add(String a,String b)
	{
		System.out.println("-Parent--Override --");
		return "";
	}
	
	protected Boolean methodParent(String a,String b)
	{
		System.out.println("---Parent Overrinding--");
		return true;
	}
	
	
	
}
