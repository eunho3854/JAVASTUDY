package ch3;

import java.util.Scanner;

public class Ex111_4 {

	public static void main(String[] args) {
		System.out.print("���� 3�� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		// input1 ��
		if((input1 > input2 && input1 < input3) || (input1 > input3 && input1 < input2)) {
				System.out.println("�߰� ���� : " + input1);
		}
		
		// input2 ��
		if((input2 > input1 && input2 < input3) || (input2 > input3 && input2 < input1)) {
				System.out.println("�߰� ���� : " + input2);
		}
		
		// input3 ��
		if((input3 > input2 && input3 < input1) || (input3 > input1 && input3 < input2)) {
				System.out.println("�߰� ���� : " + input3);
		}
		
	}

}
