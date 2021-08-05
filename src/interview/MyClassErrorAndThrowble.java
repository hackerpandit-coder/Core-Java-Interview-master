package interview;

import java.sql.SQLException;

public class MyClassErrorAndThrowble{

	public static void main(String[] args)
	{
		MyClassErrorAndThrowble error = new MyClassErrorAndThrowble();
		 
		//Unhandled Exception should by handled by try catch
//		 error.exp(); //: Compile Time Error
		 error.exp1(); //: RuntimeException will throw
	 try{
		
	    /*Working Possibility without Throwable
	     * catch(Exception e)
	     * catch(RuntimeException e)
	     * catch(Error | Exception e)
	     * catch(Exception | Error e)
	     * catch(Throwable e)  // It wont require ANY combination with any one.
	     * catch(Child Exception | Child Exception e) 
	        i.e  catch(ArithmeticException | NullPointerException | NumberFormatException e)
	     * 
	     * Compile Time Error Possibility
	     * catch(IOException e)
	     * catch(SQLException e)
	     * catch(FileNotFoundException e)
	     * catch(Throwable | Error e)
	     * catch(Error | Throwable e)
	     * catch(RuntimeException | Exception e)
	     * 
	     * 
	     * catch(FileNotFoundException | IOException e)
	     * catch(FileNotFoundException | FileAlreadyExistsException | IOException e)
	     * 
	     * */
		 System.out.println("--try---");
	     }
	    catch(ArithmeticException | NullPointerException | NumberFormatException e)
		{
	    	System.out.println("--NullPointerException---"+e.getStackTrace());
		}
	    catch(Throwable e){
	    	System.out.println("--Catch---"+e.getStackTrace());
			System.out.println("--MEssage---"+e.getMessage());
	    }
	 }
	 
//	 Note: if u throwing any CHECKED exception it should handled by throws key word : Compiled Successfully
	 public void exp() throws SQLException
	 {
		 System.out.println("--SQLException---");
		 throw new SQLException();
	 }
//	 Note: if u throwing any UNCHECKED exception, No need to use handle by throws keyword : Compiled Successfully
	 public void exp1()
	 {
		 System.out.println("--Null  Pointer  Exception---");
		 throw new NullPointerException();
	 }
}


