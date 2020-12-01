package ch04;

class Cal {	// 계산기
	
	static void add(int n1, int n2) {
		System.out.println(n1+n2);
		
	}
	
//	int minus(int 3,)
}

public class Method03 {
	public static void main(String[] args) {
		//	n1을 찾고 싶음.
		
		Cal.add(5, 6);
		//	n1을 찾고 싶음
		
		// minus 함수는 return 타입이 int이기 때문에
		// Cal.minus(10, 4)가 호출된 후 메서드가 종료된다.
	}
}
