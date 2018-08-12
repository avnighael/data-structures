package climbingStairs;

public class ClimbingStairsAlgorithm {
	public int climbingStairs(int n) {
		int[] S = new int[n+1];
		
		/**
		 * Base Cases
		 */
		S[0] = 0;
		S[1] = 1;
		S[2] = 2;
		
		for(int i = 3; i<=n; i++) {
			S[i] = S[i-1] + S[i-2];
		}
		
		return S[n];
	}
}
