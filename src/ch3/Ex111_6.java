package ch3;

import java.util.Scanner;

public class Ex111_6 {

	public static void main(String[] args) {
		System.out.print("1 ~ 99 ������ ������ �Է��Ͻÿ� >> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int ten = input / 10;
		int one = input % 10;
		
		// 10�� �ڸ����� 1�� �ڸ����� ����
		if((ten == 3 || ten == 6 || ten == 9) && (one != 3 && one != 6 && one != 9)) {
			System.out.println("�ڼ�¦");
		} else if ((ten != 3 && ten != 6 && ten !=9) && (one == 3 || one == 6 || one == 9)) {
			System.out.println("�ڼ�¦");
		} else if ((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
			System.out.println("�ڼ�¦¦");
		}
	}

}
