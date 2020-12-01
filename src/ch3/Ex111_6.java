package ch3;

import java.util.Scanner;

public class Ex111_6 {

	public static void main(String[] args) {
		System.out.print("1 ~ 99 사이의 정수를 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int ten = input / 10;
		int one = input % 10;
		
		// 10의 자릿수와 1의 자릿수를 구분
		if((ten == 3 || ten == 6 || ten == 9) && (one != 3 && one != 6 && one != 9)) {
			System.out.println("박수짝");
		} else if ((ten != 3 && ten != 6 && ten !=9) && (one == 3 || one == 6 || one == 9)) {
			System.out.println("박수짝");
		} else if ((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
			System.out.println("박수짝짝");
		}
	}

}
