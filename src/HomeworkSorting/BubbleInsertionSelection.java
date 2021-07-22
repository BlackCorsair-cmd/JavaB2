package HomeworkSorting;

public class BubbleInsertionSelection {
	
	public static void main (String[] args) {
		int[] stakes = {25, 36, 48, 89, 79, 11, 1, 69};
		bubbleSortA(stakes);
		System.out.println();
		bubbleSortB(stakes);
		System.out.println();
		insertionSortA(stakes);
		System.out.println();
		insertionSortB(stakes);
		System.out.println();
		sortSelectionA(stakes);
		System.out.println();
		sortSelectionB(stakes);
		
	}
	
	public static void bubbleSortA(int[] a) {
		int n = a.length;
		for( int i = n; i >= 0; i--) {
			for(int j=0; j < i - 1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		printStakes(a);
	}

	public static void bubbleSortB(int[] a) {
		int n = a.length;
		for( int i = n; i >= 0; i--) {
			for(int j=0; j < i - 1; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		printStakes(a);
		
		
	}
	
	public static void insertionSortA(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j= i - 1;
			while( j >= 0 && input[j] > key) {
				input[ j + 1] = input[j];
				j= j - 1;
				
			}
			input [ j + 1] = key;
			
		}
		printStakes(input);
	}
	public static void insertionSortB(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j= i - 1;
			while( j >= 0 && input[j] < key) {
				input[ j + 1] = input[j];
				j= j - 1;
				
			}
			input [ j + 1] = key;
			
		}
		printStakes(input);
	}

	public static void sortSelectionA(final int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minElementIndex] > arr[j]) {
					minElementIndex = j;
				}
			}
			if (minElementIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minElementIndex];
				arr[minElementIndex] = temp;
				
				
			}
			printStakes(arr);
			
		}
	}
	public static void sortSelectionB(final int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minElementIndex] < arr[j]) {
					minElementIndex = j;
				}
			}
			if (minElementIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minElementIndex];
				arr[minElementIndex] = temp;
				
				
			}
			printStakes(arr);
			
		}
	}

	public static void printStakes(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	}





