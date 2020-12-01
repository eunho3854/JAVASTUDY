package ch04;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int a1 = c.add(10, 5);
		int a2 = c.multi(a1, 20);
		int a3 = c.divid(a2, 5);
		int a4 = c.minus(a3, 100);
		System.out.println("°á°ú°ª : " + a4);
	}

}
