package ch3;

public class Star {

	public static void main(String[] args) {
		
		// ���ﰢ��
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//Ŀ���� �۾�����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// ���̾Ƹ��
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
