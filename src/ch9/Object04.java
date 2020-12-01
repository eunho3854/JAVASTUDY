package ch9;

class User2 {
	private int id;
	private String username;
	private String password;
	
	public User2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "안녕";
	}

	public User2(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
}

public class Object04 {

	public static void main(String[] args) {
		// 레퍼런스를 호출하면 toString이 자동으로 출력
		User2 user = new User2(1, "ssar", "1234");
		String s = "안녕";
		System.out.println(s);
		System.out.println(s.toString());
	}

}
