package array;

public class Person {
	
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Br", "B"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "ere", "e", "o", "anna"};
	public static final String[] FIRST_END = {"na", "ck", "n", "tt","rian","lius","lion","les"};
	
	
	public static final String[] LAST_START = {"L", "T", "Ha", "Ja", "Po", "Ir", "Br", "Jo"};
	public static final String[] LAST_MIDDLE = {"i", "a", "ywa", "me", "rzing", "y","rd"};
	public static final String[] LAST_END = {"u", "n", "rd","s","is","lion","ing","ant","an"};
	
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3]; 
		hobby = Hobby.randomHobby();
		// TODO Auto-generated constructor stub
	}
	
	public void statYourFriends() {
		String statement = "My friends are ";
		for(int i =0; i < friends.length-1;i++) {
			statement += friends[i].firstName +" "+friends[i].lastName;
		}
		statement += "and " + friends[friends.length-1];
		System.out.println(statement);

	}
	
	public void setInFirstPlace(Person f) {
		for(int i = friends.length -1 ; i > 0; i--) {
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public void mingle(Person[] peers) {
		for(Person p: peers) {
			if(p != this) {
				setInFirstPlace(p);
			}
		}
		
	}
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
	}
	
}
