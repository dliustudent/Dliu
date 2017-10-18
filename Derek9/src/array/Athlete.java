package array;

public class Athlete extends Person{
	private int money;
	
	
	public Athlete(String first, String last, int money, Borough home) {
		super(first, last, home);
		this.money = money;
	}

	
	public String toString() {
		return super.toString() + " I also have $"+money+"!";
	}
}

