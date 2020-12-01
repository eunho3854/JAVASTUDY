package ch05;

interface Knife {
	void 요리();
	void 상해();
}

class 백종원 extends 요리사 {
	@Override
	public void 요리() {
		
	}
}
// 어댑터 용도
abstract class 요리사 implements Knife {
	public void 상해() {};
}

public class Adapter01 {

	public static void main(String[] args) {
		
	}

}
