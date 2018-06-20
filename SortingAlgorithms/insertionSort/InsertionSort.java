package insertionSort;

/**
 * Insertion Sort
 * Time Complexity: O(n^2)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort 
 * if elements are sorted in reverse order. And it takes minimum time 
 * (Order of n) when elements are already sorted.
 * Sorting In Place: Yes
 * Stable: Yes
 * Uses: Insertion sort is used when number of elements is small. 
 * It can also be useful when input array is almost sorted, 
 * only few elements are misplaced in complete big array.
 * @author Avni.Ghael
 *
 */

public class InsertionSort {
	
	/**
	 * Sorts an array using Insertion Sort algorithm
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = key;
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
		InsertionSort obj = new InsertionSort();
		int[] arr = {4,3,2,10,12,5,1,6,15,0};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}
