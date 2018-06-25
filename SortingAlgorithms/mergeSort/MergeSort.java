package mergeSort;

public class MergeSort {
	
	/**
	 * Sorts the array in ascending order
	 * @param arr - array to be sorted
	 */
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}
	
	/**
	 * Utility to sort the array using Merge Sort algorithm
	 * @param arr - array to be sorted
	 * @param low - starting point of array
	 * @param high - end point of array
	 */
	public void mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = low + (high - low) / 2;
			
			mergeSort(arr, low, mid);
			
			mergeSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
		}
	}
	
	/**
	 * Merges the array given start and end point of two sub-arrays
	 * @param arr - array to be sorted
	 * @param low - start point of left sub-array
	 * @param mid - end point of left sub-array
	 * @param high - end point of right sub-array
	 */
	public void merge(int[] arr, int low, int mid, int high) {
		int l1 = mid - low +1;
		int l2 = high - mid;
		
		int leftArray[] = new int [l1];
		int rightArray[] = new int [l2];
		
		for(int i=0; i<l1; i++) {
			leftArray[i] = arr[low + i];
		}
		
		for(int j=0; j<l2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		
		int i=0, j=0, k=low;
		while(i < l1 && j < l2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < l1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < l2) {
			arr[k] = rightArray[j];
			j++;
			k++;
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
		MergeSort obj = new MergeSort();
		int[] arr = {4,3,2,10,12,5,1,6,15,0};
		System.out.println("Array before sorting:");
		obj.printArray(arr);
		obj.sort(arr);
		System.out.println("Array after sorting:");
		obj.printArray(arr);
	}

}
