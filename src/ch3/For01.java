package ch3;

public class For01 {

	public static void main(String[] args) {
		// �ݺ��� -> ������ �ݺ��Ǵ� ��.
		// �ʱⰪ�� i=1; (for�� ������ �� ���� ȣ���)
		// ���ǽ��� i�� 5���� ���� ������ �ݺ��ϰ�
		// ������ �� �� ����� �� ���� i�� 1�� ����
		
		// ù ��° ������ �ʱⰪ ���� �� ���� Ȯ��
		// �� ��° �������ʹ� i�� ���� �� ���� Ȯ�� (�ݺ�)
		for(int i=1; i<5; i++) {
			System.out.println("���� : " + i);
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("���� : " + i);
		}
		System.out.println();
		
		for (int i = 1; i < 101; i=i+2) {
			System.out.println("���� : " + i);
		}
		
		// 0���� 100������ �� �߿��� 3�� ����� ����Ͻÿ�.
		for (int i = 0; i < 100; i=i+3) {
			System.out.println("���� : " + i);
		}
	}

}
