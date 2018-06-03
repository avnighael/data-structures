package factorial;

import java.math.BigInteger;

public class factorial {
	
	/**
	 * Recursive method to calculate factorial
	 * @param n - factorial of n number
	 * @return - int representation of calculated factorial
	 */
	public static int factorialCalc(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return n * factorialCalc(n-1);
	}
	
	/**
	 * Method to calculate factorial of large numbers
	 * @param n - factorial of n number
	 * @return - string representation of calculated factorial
	 */
	public static String BigNumsFactorial(int n) {
		BigInteger factorial = new BigInteger("1");
		
		for(int i=1; i<=n; i++) {
			factorial = factorial.multiply(new BigInteger(i + ""));
		}
		return factorial.toString();
	}

	public static void main(String[] args) {
		factorial obj = new factorial();
		int num = 10;
		System.out.println("Factorial of " + num + " is " + obj.factorialCalc(num));
		
		int largeNum = 100;
		System.out.println("Factorial of " + largeNum + " is " + obj.BigNumsFactorial(largeNum));

	}

}
