package singleton;

public class StaticHolderSingleTon {

	private StaticHolderSingleTon() {
		
	}
	
	private static class InstanceHolser {
		final static StaticHolderSingleTon I_HOLDER_SINGLE_TON = new StaticHolderSingleTon();
	}
	
	public static StaticHolderSingleTon getInstance() {
		return InstanceHolser.I_HOLDER_SINGLE_TON;
	}
	
	public static void main(String[] args) {
		System.out.println("main 函数");
		StaticHolderSingleTon.getInstance().someService();;
	}
	
	private void someService() {
		System.out.println("输出");
	}
	
}
