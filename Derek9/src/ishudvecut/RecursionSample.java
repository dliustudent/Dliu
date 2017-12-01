package ishudvecut;

public class RecursionSample {
	
	 public static void main(String[] args){
		 int value = 20;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			if(testPrime == value) 
				return 1;
			else if(value%testPrime == 0) 
				return countPrimeFactors(value/testPrime, testPrime) +1;
			else
				return countPrimeFactors(value, testPrime +1);
			
		 }

		 public static long factorial(long value) {
			 if(value == 1) {
				 return 1;
			 }else {
				return value*factorial(value-1);
			 }
		 }
}