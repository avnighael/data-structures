package insertionSort;

public class RecursiveInsertionSort {

	/**
	 * Sorts an array using Insertion Sort algorithm
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr, int n) {
		
		// Base case
		if(n <= 1)
			return;
		
		// Sort first n-1 elements
		sort(arr, n-1);
		
		// Insert last element at its correct position
		// in a sorted array
		int lastElem = arr[n-1];
		int j = n-2;
			
		/* Move elements of arr[0..i-1], that are
	      greater than key, to one position ahead
	      of their current position */
		while(j>=0 && arr[j] > lastElem) {
			arr[j+1] = arr[j];
			j -= 1;
		}
		arr[j+1] = lastElem;
	}
	
	/**
	 * Prints the array
	 * @param arr - array to be printed
	 */
	public void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		RecursiveInsertionSort obj = new RecursiveInsertionSort();
		int[] arr = {4,3,2,10,12,5,1,6,15,0};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr, arr.length);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}