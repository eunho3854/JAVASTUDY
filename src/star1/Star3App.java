package star1;

// 1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit Ÿ�� ��ġ


public class Star3App {
	
	static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName() + " -> " + u2.getName() + " ����");
		u2.setHp(u2.getHp() - u1.getAttack()); 
		System.out.println(u2.getName() + " ü�� : " + u2.getHp());
		System.out.println();
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Dragoon d1 = new Dragoon("���1", 100, 20);
		Darktempler dt1 = new Darktempler("����1", 100, 50);
		Tank t1 = new Tank("��ũ1", 100, 60);
		Scv s1 = new Scv("scv", 100, 5);

		Star3App.attack(z1, d1);
		Star3App.attack(dt1, t1);
		Star3App.attack(s1, d1);
		Star3App.attack(dt1, s1);
	}
}
