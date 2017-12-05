package search;

public class Hanoi {

	public static void main(String[] args) {
		towersofHanoi(3, "a", "b", "c");
	}

	public static void towersofHanoi(int n, String start, String help, String end) {
		if (n == 1) {
			System.out.println(start + "to" + end);
		} else {
			towersofHanoi(n - 1, start, end, help);
			System.out.println(start + "to" + end);
			towersofHanoi(n - 1, help, start, end);
		}
	}
}
