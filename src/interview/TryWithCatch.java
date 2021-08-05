package interview;

public class TryWithCatch {

	public static void main(String[] args){
		TryBlock tryBlock = new TryBlock();
		try {
			tryBlock.withDrawMoney(12000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class TryBlock
{
	public double withDrawMoney(int amount) throws Exception
	{
		double avlBal=10000;
		
		
			if(amount<avlBal)
			{
				System.out.println("Money withdraw Successfully");
			}
			else 
			{
				throw new InSufficientAmtException("InSufficient balance");
			}
		
		
		
		return amount;
		
	}
}
class InSufficientAmtException extends Exception
{
	private static final long serialVersionUID = 1L;

	public InSufficientAmtException(String msg) {
		super(msg);
	}

}
