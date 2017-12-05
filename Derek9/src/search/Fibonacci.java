package search;

public class Fibonacci(){

	public static void main(String[] args) {
		System.out.println(Fib5onacci(10));
	}

	public static int Fib5onacci(int n) {
	if(n == 0) {
		return 1;
	}
	else {
		return Fib5onacci(n)+ Fib5onacci(n-1);
		}
	}
}
