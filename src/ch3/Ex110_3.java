package ch3;

import java.util.Scanner;

public class Ex110_3 {

	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int m5 = 0;
		int m1 = 0;
		int c1 = 0;
		int b1 = 0;
		int s5 = 0;
		int s1 = 0;
		int o = 0;

		// 5������
		if (money >= 50000) {
			m5 = money / 50000;
			money = money - (50000 * m5);
		}
		
		// ������
		if (money >= 10000 || money < 50000) {
			m1 = money / 10000;
			money = money - (10000 * m1);
		}
		
		// õ����
		if (money >= 1000 || money < 10000) {
			c1 = money / 1000;
			money = money - (1000 * c1);
		}
		
		// ���
		if (money >= 100 || money < 1000) {
			b1 = money / 100;
			money = money - (100 * b1);
		}
		
		// ���ʿ�
		if (money >= 50 || money < 100) {
			s5 = money / 50;
			money = money - (50 * s5);
		}
		
		// �ʿ�
		if (money >= 10 || money < 50) {
			s1 = money / 10;
			money = money - (10 * s1);
		}
		
		// �Ͽ�
		if (money >= 1 || money < 10) {
			o = money / 1;
			money = (money - 1 * o);
		}

		System.out.println("�������� : " + m5 + "��");
		System.out.println("������ : " + m1 + "��");
		System.out.println("õ���� : " + c1 + "��");
		System.out.println("��� : " + b1 + "��");
		System.out.println("���ʿ� : " + s5 + "��");
		System.out.println("�ʿ� : " + s1 + "��");
		System.out.println("�Ͽ� : " + o + "��");

	}

}
