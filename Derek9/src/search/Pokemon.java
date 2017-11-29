package search;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level) {
		hp = 100;
		poisoned = false;
		
	}
	
	public void iChooseYou() {
		System.out.println(name+", "+name+"!");
	}
	
	public int getHp() {
		return hp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHp(int newHP) {
		hp = newHP;
	}
	
	public void levelUp(Effect e) {
		level++;
		e.happen();
	}
	
	public void setPoisoned(boolean b) {
		poisoned = b;
	}
	
	public void lapse() {
		if(poisoned) {
			hp -= 15;
		}
	}

	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
		 }

}
