package interview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CocurrentModificationHashMap {

	public static void main(String[] args) {

//		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> map = new ConcurrentHashMap<>();
		
		Runnable runnable1 = ()->
		{
			for(int i =0 ;i<10;i++){
				map.put(i,i);
				System.out.println("--Thread 1---"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("--map---"+map);
		};
		
		Thread t1 = new Thread(runnable1);
		t1.start();
		
		Runnable runnable2 = ()->
		{
			for(int i =0 ;i<10;i++){
				map.put(i,i);
				map.remove(i);
				System.out.println("--Thread 2---"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("--map---"+map);
			
		};
		
		Thread t2 = new Thread(runnable2);
		t2.start();
		
		for(int i =10 ;i>0;i--){
			System.out.println("- Main-Thread Remove---"+i);
			map.remove(i);
			try {
				map.wait(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("--The End---"+map);
		
	}

}

