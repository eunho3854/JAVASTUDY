package ch3;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		
		// Scanner를 이용하면 I/O 장치로 접근 가능!!
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 블락킹, 동기적 프로그램
		
		System.out.println("입력 받은 값 : " + num);
	}
}
