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
	
	public Person(String first, String last, Borough home) {
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
	}
	
}
