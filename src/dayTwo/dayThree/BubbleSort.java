package dayTwo.dayThree;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		int [] firstArray = new int[] {5, 1, 6, 7, 6, 5, 8, 2};
		
		int [] secondArray = new int[] {40, 50, 10, 1, 6, 12, 555};
		
		
		//		printArray(firstArray);

		//		bubbleSort(firstArray);
		//		printArray(firstArray);
		System.out.println(findIndexForNumber(firstArray, 6));
		System.out.println(getAllIndexesForNumber(firstArray, 6));
		System.out.println(getAllIndexesForNumber(firstArray, 0));
		System.out.println(getAllIndexesForNumber(null, 6));
		System.out.println(getNumberOfOcurrencesVariantOne(firstArray, 0));
		System.out.println(getNumberOfOcurrencesVariantOne(firstArray, 5));
	}
	

	public static void bubbleSort (int [] input) {
		int n = input.length;
		for (int i = 0; i < n - 1; i++) {
			for ( int j = 0; j < n - 1 - i; j++) {
				if (input[j] > input[ j + 1])	{
					int tmp = input[j];
					input[j] = input[ j+1];
					input[j+1] = tmp;
				}

			}
		}

	}

	// linear search 
	public static int findIndexForNumber(int [] input, int number) {
		// proveri za sekoj index od array dali vrednosta za daden index
		// e ednavka na brojot koj go barame
		// ako e ednakva vrati go index kako rezultat
		for (int i = 0; i < input.length; i++) {
			if(input[i] == number) {
				return i;
			}
		}
		return -1;
	}

	public static List<Integer> getAllIndexesForNumber(int[] input, int number) {
		List<Integer> indexes = new ArrayList<>();
		
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				if(input[i] == number) {
					indexes.add(i);		
				}

			}
		}
		return indexes;
	}
	
	public static int getNumberOfOcurrencesVariantOne(int[] input, int number) {
	return getAllIndexesForNumber(input, number).size();
	
}public static int getNumberOfOcurrencesVariantTwo(int[] input, int number) {
	int counter = 0;
	if (input != null) {
		for (int i = 0; i < input.length; i++) {
			if(input[i] == number) {
				counter++;
	
			}
		}
	}
	return counter;
}

	public static void printArray(int [] input) {
		System.out.print("[");
		for (int i : input) {
			System.out.print(i + ", ");		
		}
		System.out.println("]");
	}

}
