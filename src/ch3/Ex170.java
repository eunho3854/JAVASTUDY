package ch3;

import java.util.Scanner;

public class Ex170 {

	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위", "바위", "보"}; // 가위 바위 보 배열
		Scanner sc = new Scanner(System.in); // 입력
		int n = (int)(Math.random()*3); // n은 0, 1, 2 중에서 랜덤하게 결정
		
		// for문 무한반복 (break로 탈출 예정)
		for(;;) {
			System.out.print("가위 바위 보! >> ");
			String g = sc.nextLine();
			
			// 컴퓨터가 바위
			if(str[n].equals("바위")) {
				if(g.equals("가위")) {
			System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				} else if(g.equals("바위")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				} else if(g.equals("보")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				}
			}
			
			// 컴퓨터가 가위
			if(str[n].equals("가위")) {
				if(g.equals("가위")) {
			System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				} else if(g.equals("바위")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				} else if(g.equals("보")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				}
			}
			
			// 컴퓨터가 보
			if(str[n].equals("보")) {
				if(g.equals("가위")) {
			System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				} else if(g.equals("바위")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				} else if(g.equals("보")) {
					System.out.println("사용자 = " + g + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				}
			}
			
			// for문 탈출
			if(g.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
		}
	}

}
