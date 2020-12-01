package ch3;

public class For02 {

	public static void main(String[] args) {
		
		// Â¦¼ö 1 ~ 100
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.println("2ÀÇ ¹è¼ö : " + i);
			}
		}
		
		// È¦¼ö 1 ~ 100
		for(int i=1; i<101; i++) {
			if(i%2==1) {
				System.out.println("È¦¼ö : " + i);
			}
		}
	}

}
