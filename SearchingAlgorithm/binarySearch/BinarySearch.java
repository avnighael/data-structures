package binarySearch;

// NOTE for me: I did a mistake of forgetting about adding stopping condition for recursion
// i.e. if element is not found, return false and for this the stopping recursion condition 
// is if(high >= low)

public class BinarySearch {

	/**
	 * Returns whether the search element is present in the array or not recursively
	 * @param arr - array to be searched in
	 * @param x - element to search in array
	 * @param low - starting point of searching range in array
	 * @param high - end point of searching range in array
	 * @return - true if x is present in array, false otherwise
	 */
	public static boolean binarySearchRecursively(int arr[], int x, int low, int high) {
		if(high >= low) {
			int mid = low + (high - low) / 2;
			
			// found the element
			if(arr[mid] == x) {
				return true;
			}
			
			// If element is greater than mid
			// then element can be present in right subarray
			if(arr[mid] > x) {
				return binarySearchRecursively(arr, x, low, mid - 1);
			}
			
			// If element is less than mid
			// then element can be present in left subarray
			if(arr[mid] < x) {
				return binarySearchRecursively(arr, x, mid + 1, high);
			}
		}	
		return false;
	}
	
	/**
	 * Returns whether the search element is present in the array or not iteratively
	 * @param arr - array to be searched in
	 * @param x - element to search in array
	 * @param low - starting point of searching range in array
	 * @param high - end point of searching range in array
	 * @return - true if x is present in array, false otherwise
	 */
	public static boolean binarySearchIteratively(int arr[], int x, int low, int high) {
		while(high >= low) {
			int mid = low + (high - low) / 2;
			
			// found the element
			if(arr[mid] == x) {
				return true;
			}
			
			// If element is greater than mid
			// then element can be present in right subarray
			if(arr[mid] > x) {
				high = mid - 1;
			}
			
			// If element is less than mid
			// then element can be present in left subarray
			if(arr[mid] < x) {
				low = mid + 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// for binary search, array needs to be in sorted fashion
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
		int x = 600;
		System.out.println(binarySearchRecursively(arr, x, 0, arr.length - 1));
		System.out.println(binarySearchIteratively(arr, x, 0, arr.length - 1));
		int y = 60;
		System.out.println(binarySearchRecursively(arr, y, 0, arr.length - 1));
		System.out.println(binarySearchIteratively(arr, y, 0, arr.length - 1));
	}

}
