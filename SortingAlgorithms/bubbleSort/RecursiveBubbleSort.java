package bubbleSort;

public class RecursiveBubbleSort {

	/**
	 * Sort an array using Bubble Sort
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr) {
		int n = arr.length;
		sortUtil(arr, n);
	}
	
	/**
	 * Utility to bubble sort an array
	 * @param arr - array to be sorted
	 * @param n - number of elements in an array to be sorted
	 */
	public void sortUtil(int[] arr, int n) {		
		if(n == 1) {
			return;
		}
	
		for(int j=0; j < n - 1; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}	
		
		sortUtil(arr, n-1);
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
		RecursiveBubbleSort obj = new RecursiveBubbleSort();
		int[] arr = {5,1,4,2,8};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}
