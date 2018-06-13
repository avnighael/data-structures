package searchingProblems;

public class SearchInASortedAndRotatedArray {
	
	/**
	 * Returns whether the search element is present in the array or not recursively
	 * @param arr - array to be searched in
	 * @param x - element to search in array
	 * @param low - starting point of searching range in array
	 * @param high - end point of searching range in array
	 * @return - true if x is present in array, false otherwise
	 */
	public static boolean search(int arr[], int x, int low, int high, int mid) {
		if(high >= low) {
			
			// found the element
			if(arr[mid] == x) {
				return true;
			}
			
			// If element is greater than mid
			// then element can be present in right subarray
			if((arr[mid] < x) && (x < arr[high])) {
				int newLow = mid + 1;
				mid = newLow + (high - newLow) / 2;
				return search(arr, x, newLow, high, mid);
			}
			
			// If element is less than mid
			// then element can be present in left subarray
			if((arr[low] < x) && (x < arr[mid - 1])) {
				int newHigh = mid - 1;
				mid = low + (newHigh - low) / 2;
				return search(arr, x, low, newHigh, mid);
			}
		}	
		return false;
	}
	
	public static int getMid(int[] arr) {
		int min = arr[0];
		int minIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
				break;
			}
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int mid = getMid(arr);
		
		System.out.println(search(arr, 0, 0, arr.length - 1, mid));
	}

}
