package ch3;

import java.util.Scanner;

public class Ex106 {

	public static void main(String[] args) {
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		System.out.print("영희 >> ");
		String input2 = sc.nextLine();
		
		String str[] = {"가위", "바위", "보"};
		
		// 철수 가위
		if(input1.equals("가위")) {
			if(input2.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if(input2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			} else if(input2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		}
		
		// 철수 바위
		if(input1.equals("바위")) {
			if(input2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else if(input2.equals("바위")) {
				System.out.println("비겼습니다.");
			} else if(input2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		
		// 철수 보
		if(input1.equals("보")) {
			if(input2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			} else if(input2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else if(input2.equals("보")) {
				System.out.println("비겼습니다.");
			}
		}
		
	}

}
