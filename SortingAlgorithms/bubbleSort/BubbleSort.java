package bubbleSort;

/**
 * Bubble Sort
 * Worst and Average Time Complexity: O(n^2)
 * Best Time Complexity: O(n)
 * Auxiliary Space: O(1)
 * Sorting In place: Yes
 * Stable: Yes
 * @author Avni.Ghael
 *
 */
public class BubbleSort {

	/**
	 * Sort an array using Bubble Sort
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr) {
		Boolean isSwapped;
		for(int i = 0; i < arr.length - 1; i++) {
			isSwapped = false;
			for(int j=0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					isSwapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!isSwapped) {
				break;
			}
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
		BubbleSort obj = new BubbleSort();
		int[] arr = {5,1,4,2,8};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}
