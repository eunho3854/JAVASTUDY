package ch3;

import java.util.Scanner;

public class MoneyApp {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		final int money = sc.nextInt();
		int rMoney = money;
		int rCount = 0;
		
		int[] arr = {50000, 10000, 1000, 100, 50, 10, 1};
		
		for(int i = 0; i < 7; i++) {
			rCount = rMoney / arr[i];
			rMoney = rMoney % arr[i];
			if(rCount != 0) {
				System.out.println(arr[i] + "원권 : " + rCount);
			}
		}
	}

}
