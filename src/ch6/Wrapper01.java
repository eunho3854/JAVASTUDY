package ch6;

public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10;	// 4Byte
		Integer num2 = 20;	// Integer�� Ŭ���� (���۷���)
		
		
		// ���ڸ� ���ڷ� �ٲٴ� ��
		// ���ڸ� ���ڷ� �ٲٴ� ��
		String num3 = (String)num2.toString();
		System.out.println(num3);
		
		String num4	= num + "";
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
	}
}
