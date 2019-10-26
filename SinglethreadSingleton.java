package singleton;

public class SinglethreadSingleton {

	private static SinglethreadSingleton singlethreadSingleton = null;
	
	private SinglethreadSingleton() {
		
	}
	/**单线程*/
	
	public static SinglethreadSingleton getInstance() {
		if(singlethreadSingleton==null) {
			singlethreadSingleton = new SinglethreadSingleton();
		}
		return singlethreadSingleton;
	}
}
