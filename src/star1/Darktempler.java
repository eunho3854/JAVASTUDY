package star1;

class Darktempler extends StarUnit{
//	public Darktempler(String n, int h, int a) {
//		super(n, h, a);
//		// TODO Auto-generated constructor stub
//	}
	
	private String name;
	private int hp;
	private int attack;
	
	public Darktempler() {
		// TODO Auto-generated constructor stub
	}

	public Darktempler(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
}
