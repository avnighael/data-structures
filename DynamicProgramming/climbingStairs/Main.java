package climbingStairs;

public class Main {

	public static void main(String[] args) {
		ClimbingStairsAlgorithm obj = new ClimbingStairsAlgorithm();
		int n = 20;
		int numOfWays = obj.climbingStairs(n);
		System.out.println("Number of ways to climb " + n + " stairs: " + numOfWays);

	}

}
