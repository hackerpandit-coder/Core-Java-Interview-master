package interview;

public class Test {

	public static void main(String[] args) {
		
		Runnable runnable1 = ()->
		{
			for(int i =0 ;i<10;i++){
				System.out.println("-Thread 1--"+"-----Happy Engineers Day------");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(runnable1);
		t1.start();
		
		Thread t2 = new Thread(()->
		{for(int i =0 ;i<10;i++){
			System.out.println("-Thread 2--"+"-----Bhag BHAG -d-Ke------");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		
		t2.start();
		
		
		

	}

}
