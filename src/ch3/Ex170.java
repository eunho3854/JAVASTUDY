package ch3;

import java.util.Scanner;

public class Ex170 {

	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String str[] = {"����", "����", "��"}; // ���� ���� �� �迭
		Scanner sc = new Scanner(System.in); // �Է�
		int n = (int)(Math.random()*3); // n�� 0, 1, 2 �߿��� �����ϰ� ����
		
		// for�� ���ѹݺ� (break�� Ż�� ����)
		for(;;) {
			System.out.print("���� ���� ��! >> ");
			String g = sc.nextLine();
			
			// ��ǻ�Ͱ� ����
			if(str[n].equals("����")) {
				if(g.equals("����")) {
			System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
				} else if(g.equals("����")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				} else if(g.equals("��")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				}
			}
			
			// ��ǻ�Ͱ� ����
			if(str[n].equals("����")) {
				if(g.equals("����")) {
			System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				} else if(g.equals("����")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				} else if(g.equals("��")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
				}
			}
			
			// ��ǻ�Ͱ� ��
			if(str[n].equals("��")) {
				if(g.equals("����")) {
			System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				} else if(g.equals("����")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
				} else if(g.equals("��")) {
					System.out.println("����� = " + g + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				}
			}
			
			// for�� Ż��
			if(g.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
		}
	}

}
