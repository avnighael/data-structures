package coinChange;

public class Main {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3}; 
        int target = 2; 
		CoinChange cc = new CoinChange();
		int result = cc.getMinChange(arr, target);
		System.out.println(result);
	}

}
