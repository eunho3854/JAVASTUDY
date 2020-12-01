package ch02;

// 자바는 .class 파일을 실행하면 static 부분을 메모리에 로드한다.(static 공간)
// static 공간에 있는 main() 함수를 찾아서 호출하고
// 이때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
// main이 stack 종료되면 프로그램 종료!!
public class Var01 {
	public static void main(String[] args) {
		// code 부분
		int num = 10; // 4Byte - 32bit - 42억9천(-20억 ~ +20억)
		long num2 = 100; // 8Byte
		
		char s = 'A';  // 2Byte
		
		double d = 7.5; // 8Byte 42억9천(-20억 ~ +20억) 추가 소수점 이하
		
		boolean b = true; // 1bit
		
		num = (int)d; // 명시적 형변환(다운 캐스팅-자료유실)
		
		num = (int)num2; // 명시적 형변환(다운캐스팅)
		
		num2 = num; // 묵시적 형변환(업 캐스팅)
		
	}	// end of main
}
