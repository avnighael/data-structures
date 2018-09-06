package coinChange;

/**
 * Given denominations and target value
 * find minimum number of coins required
 * to achieve that target value
 * @author avni
 *
 */
public class CoinChange {

	public int getMinChange(int[] den, int target) {		
		
		// changes[i] will store the minimum number 
		// of coin change required for i value
		int[] changes = new int[target+1];
		
		// Base case (if target value is 0)
		changes[0] = 0;
		
		for(int i=1; i<=target; i++) {
			int minChange = Integer.MAX_VALUE;
			for(int j=0; j<den.length; j++) {
				int curDenom = den[j];
				if(curDenom <= i) {
					int temp = 1 + changes[i-curDenom];
					
					if(temp < minChange) {
						minChange = temp;
					}
				}
				
			}
			changes[i] = minChange;
		}
		
		return changes[target];
	}
}
