package ch3;

import java.util.Scanner;

public class Ex106 {

	public static void main(String[] args) {
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >> ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		System.out.print("���� >> ");
		String input2 = sc.nextLine();
		
		String str[] = {"����", "����", "��"};
		
		// ö�� ����
		if(input1.equals("����")) {
			if(input2.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if(input2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else if(input2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}
		
		// ö�� ����
		if(input1.equals("����")) {
			if(input2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if(input2.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if(input2.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}
		
		// ö�� ��
		if(input1.equals("��")) {
			if(input2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else if(input2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if(input2.equals("��")) {
				System.out.println("�����ϴ�.");
			}
		}
		
	}

}
