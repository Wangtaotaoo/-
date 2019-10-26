package singleton;

public class DCLsingleton {
private static volatile DCLsingleton dcLsingleton = null;
public DCLsingleton() {
}

/**双重检索，使用锁 + volatile*/
public static DCLsingleton getIntsaDcLsingleton() {
	if(dcLsingleton==null) {
		synchronized (DCLsingleton.class) {
			if(dcLsingleton==null) {
				dcLsingleton = new DCLsingleton();
			}
		}
	}
	return dcLsingleton;
}
}
