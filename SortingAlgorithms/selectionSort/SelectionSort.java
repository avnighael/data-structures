/**
 * Selection Sort
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * NOTE: The good thing about selection sort is 
 * it never makes more than O(n) swaps and can be useful 
 * when memory write is a costly operation.
 */
package selectionSort;

public class SelectionSort {
	
	/**
	 * Sort array by Selection Sort
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
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
		SelectionSort obj = new SelectionSort();
		int[] arr = {64, 25, 12, 22, 11};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}
