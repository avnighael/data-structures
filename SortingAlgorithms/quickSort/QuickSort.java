package quickSort;

public class QuickSort {
	
	/**
	 * Sort array using Quick Sort
	 * @param arr - array to be sorted
	 * @param low - lowest index of array
	 * @param high - highest index of array
	 */
	public void sort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
	/**
	 * Partitions the array in such a way that it places
	 * all the smaller element than the pivot element are places
	 * at the lest and higher elements at right of the pivot
	 * @param arr - array to be sorted
	 * @param low - lowest index of array where partition 
	 * needs to be performed
	 * @param high - highest index of array where partition 
	 * needs to be performed
	 * @return - partition index
	 */
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		int i =  low - 1;
		
		for(int j=low; j <= high-1; j++) {
			if(arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, high);
		return (i+1);
	}
	
	/**
	 * Swaps the two elements at specified given index
	 * @param arr - array to be sorted
	 * @param i - first element to be swapped
	 * @param j - second element to be swapped
	 */
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		QuickSort obj = new QuickSort();
		int[] arr = {64, 25, 12, 22, 11};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr, 0, arr.length - 1);
		System.out.println("Array after sorting:");
		obj.printArray(arr);

	}

}
