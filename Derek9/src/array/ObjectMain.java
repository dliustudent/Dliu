package array;

public class ObjectMain {

	public ObjectMain() {
		
		Person[] people = new Person[120];
		populate(people);
		for(Person p: people) {
			p.mingle(people);
			System.out.println(p);
			p.statYourFriends();
		}
		
		// TODO Auto-generated constructor stub
	}

	
	private void analyzeCommonalities(Person[] people, Person[] group) {
		double averageCommonality = 0;
		double trials = 500;
		double sumCounts = 0;
		for(int i =0; i < trials;i++) {
			group = selectGroup(people, people.length);
			sumCounts += countCommonalities(people, group);
		}
		System.out.println(("After "+trials+" trials, shuffling "+people.length+" people, on average, "
		+averageCommonality+" people end up in the same position where they started."));
	}

	private void populate(Person[] people)
	{
		for(int i =0; i<people.length; i++)
		{
			String firstName = randomNameFrom(Person.FIRST_START,
			Person.FIRST_MIDDLE,Person.FIRST_END);
			
			String lastName = randomNameFrom(Person.LAST_START,
			Person.LAST_MIDDLE,Person.LAST_END);
			
			Borough home = randomBorough();
			people[i] = new Person(firstName,lastName,home);
			if(Math.random() < .6){
				int money = (int)(Math.random()*20+1)*100000;
				people[i]  = new Athlete(firstName, lastName, money, home);
				
			}
			else {
				people[i] = new Person(firstName, lastName, home);
			}
		}
	}
	
	private Borough randomBorough()
	{
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}
	
	
	
	private String randomNameFrom(String[] a,String[] b, String[] c)
	{
		return get(a)+get(b)+get(c);
	}
	private String get(String[] a)
	{
		return a[(int)(Math.random()*a.length)];
	}
	
	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
	}
	
	
	private int countCommonalities(Object[] arr1, Object[] arr2) {
		int count = 0;
		for(int i =0; i<arr1.length;i++) {
			if(arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	private Person[] selectGroup(Person[] population, int length) {
		Person[] group = new Person[length];
		for(int i = 0; i <length; i++) {
			Person toAdda = randomPerson(population);
			while(alreadyContains(group, toAdda)) {
				toAdda = randomPerson(population);
			}
			group[i] = toAdda;
		}
		return group;
	}
	
	private Person randomPerson(Person[] population) {

			int a = (int)Math.random()*population.length;				
			return population[a];
}

	
	private boolean alreadyContains(Person[] population, Person p) {
		for(int i =0; i <population.length;i++) {
			if(population[i] == p) {
				return true;
			}
		}
		return false;
	}
	
}
