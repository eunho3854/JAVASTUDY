package ch3;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 5개 입력하세요. ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n <= 0)
				// continue; // 즉시 다음 반복문으로 넘어가는 명령어
				break;	// 반복문을 종료하는 명령어
			else
				sum = sum + n;
		} // end of for
		System.out.println("양수의 합은 " + sum);
		
		sc.close();
	}

}
