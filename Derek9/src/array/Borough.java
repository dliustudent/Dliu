package array;

public class Borough {

	
	public static final Borough[] NY_BOROUGHS = {new Borough("Brooklyn"),new Borough("Manhattan"), new Borough("Queens"),new Borough("Bronx"), new Borough("Staten Island")};
	
	
	
	
	private String name;
	
	public Borough(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() 
	{
		return name;
	}

}
