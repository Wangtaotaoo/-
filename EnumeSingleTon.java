package singleton;

public class EnumeSingleTon {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			SingleTon.Instance.someService();	
			}
		}).start();
		
	}
	
	public static enum SingleTon{ //枚举类相当于单利类，Instance为唯一的实例
		Instance;  
		private SingleTon() {
			// TODO Auto-generated constructor stub
		System.out.println("私有构造器");
		}
		
		private void someService() {
			System.out.println("服务");
		}
		
	}
}
