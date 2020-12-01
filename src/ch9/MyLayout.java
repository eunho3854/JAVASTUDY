package ch9;

public enum MyLayout {
	WEST("West"), 
	EAST("EAST"), 
	SOUTH("SOUTH"), 
	NORTH("NORTH"), 
	CENTER("CENTER");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	private MyLayout(String value) {
		this.value = value;
	}
}
