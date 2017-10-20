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
	private String nickname;
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3]; 
		hobby = Hobby.randomHobby();
		nickname = createNickname(firstName);
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Pass by value 
	 * the parameters of a method contain only values, not references
	 * therefore, when they are changed, the REFERENCE to the original object does not change
	 * 
	 * @param name
	 * @return
	 */
	public static String createNickname(String name) {
		String nickname = "";
		int vowel = 0;
		for(int i =0;i<name.length();i++) {
			String letter = name.substring(i,i+1);
			if(returnVowel(letter)) {
				vowel++;
				if(vowel != 2) {
					nickname += letter;
				}
				else {
					return nickname;
				}
			}
			else {
				nickname += letter;
			}
		}
		return name;
	}
	
	public static boolean returnVowel(String letter) {
		letter = letter.toLowerCase();
		if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")) {
			return true;
		}
		return false;
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
		return "My name is "+firstName+ " " +lastName+ ". Call me " + nickname+ "and I am from "+home+".";
	}
	
}
