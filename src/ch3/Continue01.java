package ch3;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ 5�� �Է��ϼ���. ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n <= 0)
				// continue; // ��� ���� �ݺ������� �Ѿ�� ��ɾ�
				break;	// �ݺ����� �����ϴ� ��ɾ�
			else
				sum = sum + n;
		} // end of for
		System.out.println("����� ���� " + sum);
		
		sc.close();
	}

}
