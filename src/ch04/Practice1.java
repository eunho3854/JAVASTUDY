package ch04;

class TV {
	private String name;
	private int year;
	private int inch;
	
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}

public class Practice1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
