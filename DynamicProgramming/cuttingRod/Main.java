package cuttingRod;

public class Main {

	public static void main(String[] args) {
		CuttingRod cr = new CuttingRod();
		int[] prices = {1,5,8,9,10,13};
		int maxRevenue = cr.getMaxRevenue(6, prices);
		System.out.println("The maximum revenue can be obtained "
				+ "by cutting rod is" + maxRevenue);
	}
}
