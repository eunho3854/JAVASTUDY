package ch04;
class Job {

	public String getName() {
		return "";
	}
	
}

class Police extends Job{
	String name = "°æÂû";

	public Police() {
	}
	
	public Police(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Doctor extends Job {
	String name = "ÀÇ»ç";
	public Doctor() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Doctor(String name) {
		this.name = name;
	}
	
}

public class Array02 {

	public static void main(String[] args) {
		Job[] j = new Job[2];

		j[0] = new Police();
		j[1] = new Doctor();
		
		System.out.println(j[0].getName());
		System.out.println(j[1].getName());

	}

}
