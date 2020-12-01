package ch04;

class President {
	String name;
	
	private static President instance = new President();
	public static President getInstance() {
		return instance;
	}
	private President() {
		
	}
}

public class SingtonApp {

	public static void main(String[] args) {
		President p = President.getInstance(); // 싱글톤 패턴
		// 객체를 한 번만 만들어주는 패턴
	}
}
