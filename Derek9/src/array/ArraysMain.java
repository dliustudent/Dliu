package array;

import java.util.Arrays;

public class ArraysMain {
	
	private String[] suits;
	private String[] values;
	private int[] testArray;
	
	public ArraysMain() {
		suits = new String[4];
		suits[0] = "Clubs";
		suits[1] = "Diamonds";
		suits[2] = "Heart";
		suits[3] = "Spades";
		values = new String[13];
		for (int i =0; i<values.length;i++) {
			values[i] = "" + (i+1);
		}
		
		values[0] = "ace";
		values[12] = "king";
		values[11] = "queen";
		values[10] = "jack";
		printDeck();
//		System.out.println(Arrays.toString(testArray));
	}
	
	private void printDeck() {
		for(int i =0; i < suits.length; i++) {
			for(int k =0; k <values.length; k++) {
				System.out.println(values[k] +" of " + suits[i]);
			}
		}
		
		/*
		 *  for(String suit: suits){
		 * 	for(String value: values){
		 * 	deck[index] = value + "of" + suit;
		 * index++
		 * }
		 * }
		 * return deck;
		 * }
		 * 
		 */
	}

	private void shuffle(int[] arr) {
		for (int i =0;i <arr.length; i++) {
			swap(arr,i,(int)(Math.random()*arr.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
	}

	private void populate1ToN(int[] arr) {
		int count = 0;
		for(int i =0; i <arr.length; i ++) {
			arr[i]=(i+1);
		}
		
	}

	private void countOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end - start +1];
		for (int value: arr) {
			counter[value-start]++;
		}
		for(int i = 0 ; i < counter.length; i++) {
			System.out.println("The value " + (i+start)+ " was rolled " +counter[i]+" times.");
		}
	}

	private void populate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = diceRoll(2);
		}
	}

	public void arrayNotes() {
		//two ways to construct an array:
				int[] firstWay = {0,1,2,3,4,5};
				//this will only work with the declaration.
				//will not work:
				//firstWay = {6,7,8,9,10};
				
				String[] secondWay = new String[5];
				//you can go on like so, creating values at each index:
				//secondWay[0] = 1;
			//	secondWay[1] = 10;
				
				//TWO WAYS TO ITERATE THROUGH AN ARRAY:
				for(int i = 0; i <secondWay.length; i ++ ) {
					System.out.println("The # " + i + " element is " + secondWay[i]);
				}
				//"for each int in secondWay"
				for(String value: secondWay) {
					System.out.println("Element is "+value);
				}
				//NOTE: primitive arrays are auto-populated with 0's
				//objects arrays are not populated(null)
	}
	
	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		//1. Arrays are collections of primitives and Objects
		//special note: this is the only collection of primitives
		
		//2. size cannot be edited
		
		//3. elements of an array are references to objects. In other 
		// words, changing an element of an array changes the 
		// references, not the object
	}
	
	public int diceRoll(int n) {
		int sum = 0;
		for(int i =0; i < n ; i ++) {
			int dieRoll = (int)(Math.random()*6)+1;
			sum += dieRoll;
		}
		return sum;
	}
}
