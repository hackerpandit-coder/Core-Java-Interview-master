package interview;

public class TryWithCatchAndReturn {

	public static void main(String[] args) {

		TryWithCatchAndReturn t = new TryWithCatchAndReturn();
		System.out.println(t.getNmberFinally());
	}

	@SuppressWarnings("finally")
	public int getNmberFinally() {

		
		try {
			System.out.println("try");
			//throw new ArithmeticException("try phata");
			int data = 50/0;
			return 10;

		} catch (Exception e) {
			System.out.println("catch");
			return 20;
		} finally {
			System.out.println("Finally");
			return 30;
		}
	}

}

// OUTPUT--
//  try
//  finally
//  30

//When Exception came output will be this
//try
//catch
//Finally
//30

