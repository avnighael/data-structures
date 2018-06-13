/**
 * NOTE:
 * 1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..r]
4) Else (arr[mid+1..r] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[r], recur for arr[mid+1..r].
    b) Else recur for arr[l..mid] 
 */

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
	public static boolean search(int arr[], int x, int low, int high) {
			
		if(low > high) {
			return false;
			
		}
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] == x) {
			return true;
		}
		
		if(arr[low] <= arr[mid]) {
			if(arr[low] <= x && x <= arr[mid]) {
				return search(arr, x, low, mid-1);
			} else {
				return search(arr, x, mid+1, high);
			}
		} else {
			if(arr[mid] <= x && x <= arr[high]) {
				return search(arr, x, mid+1, high);
			} else {
				return search(arr, x, low, mid-1);
			}
		}	
		
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		
		System.out.println(search(arr, 60, 0, arr.length - 1));
	}

}
