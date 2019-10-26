package singleton;

public class SimplyMultithreadSingleton {
	private static SimplyMultithreadSingleton simplyMultithreadSingleton = null;
	private SimplyMultithreadSingleton() {
		
	}
	
	/**使用锁实现多线程*/
	
	public static SimplyMultithreadSingleton getInstanceMultithreadSingleton() {
		synchronized (SimplyMultithreadSingleton.class) {
			if(simplyMultithreadSingleton==null) {
				simplyMultithreadSingleton=new SimplyMultithreadSingleton();
			}
		}
		return simplyMultithreadSingleton;
	}
	


}
