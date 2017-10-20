package array;

import java.util.Arrays;

public class PassByValueExamples {

	public static void main(String[] args) {
		String s = "Hello";
		Person p = new Person("Random", "Dude", Borough.NY_BOROUGHS[0]);
		int x =5;
		int[] arr = {1,2,3};
		test2(p);
		changeEVERYTHING(s,x,arr);
		System.out.println("s is now " +s+ ", x is "+x+" arr is now "+ Arrays.toString(arr)+p);
	 }

	/**
	 * This is how you change arrays via the local variable:
	 * Through its references (i.e. indices)
	 * because primitives don't reference other data(thats why they're called primitives)
	 * it is not possible to change them via a local variable
	 * like we did with objects and arrays
	 * @param p
	 */
	
	public static void test3(int[] arr) {
		arr[0]= 999;
		arr[1] = 998;
	}
	private static void test2(Person p) {
		p.setFirstName("Original");
	}
	/**
	 * You can change an object's references via its SETTERS(methods that use objects)
	 * 
	 * @param p
	 * @param x
	 * @param arr
	 */
	private static void test1(Person p, int x, int[] arr) {
		String name = p.getFirstName();
		name = " Original";
	}

	private static void changeEVERYTHING(String s, int x, int[] arr) {
		s="Goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
	}
}
