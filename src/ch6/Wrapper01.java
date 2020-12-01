package ch6;

public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10;	// 4Byte
		Integer num2 = 20;	// Integer는 클래스 (레퍼런스)
		
		
		// 숫자를 문자로 바꾸는 법
		// 문자를 숫자로 바꾸는 법
		String num3 = (String)num2.toString();
		System.out.println(num3);
		
		String num4	= num + "";
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
	}
}
