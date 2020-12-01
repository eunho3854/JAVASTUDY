package composite;

public class ShrimpBurger extends Burger{
	
	public ShrimpBurger() {
		this(1500, "쉬림프버거");
	}
	
	public ShrimpBurger(int price, String desc) {
		super(price, desc);
	}
}
