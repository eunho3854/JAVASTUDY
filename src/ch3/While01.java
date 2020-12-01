package ch3;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int check = 0;
		// 데몬 (Daemon Process) - 웹서버 // 끝없이 계속 도는 시스템
		while(check >= 0) {
			int num =sc.nextInt();
			System.out.println("받은 값 : " + num);
			
			check = num;
//			if(num<0) {
//				break;
//			}
		}
	}

}
