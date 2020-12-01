package review;

// 자바는 함수만 만들 수가 없다. 
// 더하기 함수를 만들고 싶음. -> 더하기 함수 만들려면 클래스가 필요함.

interface A {
	void add();
}


public class Ex121 {

	public static void main(String[] args) {
		
		// 인터페이스로 익명 클래스(함수 구현되어야 함)를 만들 수 있다.
		new A() {
			
			@Override
			public void add() {
				System.out.println("더하기");
			}
		}.add();
	}

}
