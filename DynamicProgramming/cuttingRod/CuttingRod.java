package cuttingRod;

public class CuttingRod {

	public int getMaxRevenue(int n, int[] prices) {
		int[] revenue = new int[n + 1];
		revenue[0] = 0;
		
		for(int i=1; i<=n; i++) {
			int maxPrice = -1;
			for(int j=1; j<=i; j++) {
				int temp = prices[j-1] + revenue[i-j];
				if(temp > maxPrice) {
					maxPrice = temp;
				}
			}
			revenue[i] = maxPrice;
		}
		
		return revenue[n];
	}

}
