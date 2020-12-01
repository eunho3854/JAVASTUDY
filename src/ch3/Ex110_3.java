package ch3;

import java.util.Scanner;

public class Ex110_3 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int m5 = 0;
		int m1 = 0;
		int c1 = 0;
		int b1 = 0;
		int s5 = 0;
		int s1 = 0;
		int o = 0;

		// 5만원권
		if (money >= 50000) {
			m5 = money / 50000;
			money = money - (50000 * m5);
		}
		
		// 만원권
		if (money >= 10000 || money < 50000) {
			m1 = money / 10000;
			money = money - (10000 * m1);
		}
		
		// 천원권
		if (money >= 1000 || money < 10000) {
			c1 = money / 1000;
			money = money - (1000 * c1);
		}
		
		// 백원
		if (money >= 100 || money < 1000) {
			b1 = money / 100;
			money = money - (100 * b1);
		}
		
		// 오십원
		if (money >= 50 || money < 100) {
			s5 = money / 50;
			money = money - (50 * s5);
		}
		
		// 십원
		if (money >= 10 || money < 50) {
			s1 = money / 10;
			money = money - (10 * s1);
		}
		
		// 일원
		if (money >= 1 || money < 10) {
			o = money / 1;
			money = (money - 1 * o);
		}

		System.out.println("오만원권 : " + m5 + "매");
		System.out.println("만원권 : " + m1 + "매");
		System.out.println("천원권 : " + c1 + "매");
		System.out.println("백원 : " + b1 + "개");
		System.out.println("오십원 : " + s5 + "개");
		System.out.println("십원 : " + s1 + "개");
		System.out.println("일원 : " + o + "개");

	}

}
