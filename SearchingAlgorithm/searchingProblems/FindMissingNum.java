package searchingProblems;

/**
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in list. One of the integers is missing in the list. 
 * @author Avni.Ghael
 *
 */
public class FindMissingNum {

	/**
	 * Finds the missing number in array using SUM formula
	 * @param arr - input array to search in
	 * @param n - range from 1 to n
	 * @return - missing number
	 */
	public int missingNumUsingSum(int[] arr, int n) {
		int total = n * (n+1) / 2;
		
		for(int i = 0; i < arr.length; i++) {
			total -= arr[i];
		}
		return total;
	}
	
	/**
	 * Finds the missing number in array using XOR
	 * XOR returns 0 only if both the inputs are same
	 * First XOR all the elements of array - X1
	 * Then XOR 1 to n -X2
	 * XOR X1 and X2
	 * @param arr - input array to search in
	 * @param n - range from 1 to n
	 * @return - missing number
	 */
	public int missingNumUsingXOR(int[] arr, int n) {
		int X1 = arr[0];
		int X2 = 1;
		 
		for(int i = 1; i < arr.length; i++) {
			X1 = X1 ^ arr[i];
		}
		
		for(int j = 2; j <= n; j++) {
			X2 = X2 ^ j;
		}
		
		return X1 ^ X2;
	}
	
	public static void main(String[] args) {
		FindMissingNum find = new FindMissingNum();
		int[] arr = {1, 6, 4, 2, 5};
		System.out.println("Missing number using Sum formula method is: " + find.missingNumUsingSum(arr, 6));
		System.out.println("Missing number using XOR method is: " + find.missingNumUsingXOR(arr, 6));

	}

}
