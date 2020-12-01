package ch3;

import java.util.Scanner;

public class Ex111_4 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		// input1 비교
		if((input1 > input2 && input1 < input3) || (input1 > input3 && input1 < input2)) {
				System.out.println("중간 값은 : " + input1);
		}
		
		// input2 비교
		if((input2 > input1 && input2 < input3) || (input2 > input3 && input2 < input1)) {
				System.out.println("중간 값은 : " + input2);
		}
		
		// input3 비교
		if((input3 > input2 && input3 < input1) || (input3 > input1 && input3 < input2)) {
				System.out.println("중간 값은 : " + input3);
		}
		
	}

}
