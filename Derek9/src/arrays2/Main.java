package arrays2;

public class Main {

	public static void main(String[] args) {
		Array2DSampler test = new Array2DSampler();
	}
	/**
	 * PRECONDITION: i>= 0 and i < arr.length
	 * increases the element at i by 1
	 * decreases the element at i-1 and i+1, if they exist
	 * AVOIDS Arrayindexoutofboundsexception
	 * @param arr
	 * @param i
	 */
	private static void changeNeighbors(int[] arr, int i) {
		if(i<arr.length&&i>0) {
		
			arr[i] = arr[i] +1;
			
			arr[i-1] = arr[i-1] -1;
			arr[i+1] = arr[i+1] -1;
			
		}
	}

}
