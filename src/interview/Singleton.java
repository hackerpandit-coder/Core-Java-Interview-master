package interview;

public class Singleton {
	
	private Singleton() {
		super();
		System.out.println("Singleton constructor....");
	}
	
	public static Singleton singalton = null;
	
	public static Singleton getInstance() {
		if(singalton == null) {
			singalton = new Singleton();
		}
		return singalton;
	}
	
	public static void main(String[] args) {
		
		Singleton s = new Singleton();
		System.out.println(s.getInstance());
		System.out.println(s.getInstance());
		System.out.println(s.getInstance());
		System.out.println(s.getInstance());
	}
	}
