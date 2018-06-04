package binarySearch;

// NOTE for me: I did a mistake of forgetting about adding stopping condition for recursion
// i.e. if element is not found, return false and for this the stopping recursion conditon 
// is if(high >= low)

public class BinarySearch {

	/**
	 * Returns whether the search element is present in the array or not
	 * @param arr - array to be searched in
	 * @param x - element to search in array
	 * @param low - starting point of searching range in array
	 * @param high - end point of searching range in array
	 * @return - true if x is present in array, false otherwise
	 */
	public static boolean binarySearch(int arr[], int x, int low, int high) {
		if(high >= low) {
			int mid = low + (high - low) / 2;
			
			// found the element
			if(arr[mid] == x) {
				return true;
			}
			
			// If element is greater than mid
			// then element can be present in right subarray
			if(arr[mid] > x) {
				return binarySearch(arr, x, low, mid - 1);
			}
			
			// If element is less than mid
			// then element can be present in left subarray
			if(arr[mid] < x) {
				return binarySearch(arr, x, mid + 1, high);
			}
		}	
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
		int x = 60;
		System.out.println(binarySearch(arr, x, 0, arr.length - 1));
	}

}
