package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private Map<Integer, Integer> memoizeTable;
	
	public Fibonacci() {
		this.memoizeTable = new HashMap<>();
		this.memoizeTable.put(0, 0);
		this.memoizeTable.put(1, 1);
	}
	
	public int getFibonacciNum(int n) {
		if(this.memoizeTable.containsKey(n)) {
			return this.memoizeTable.get(n);
		}
		
		this.memoizeTable.put(n-1, getFibonacciNum(n-1));
		this.memoizeTable.put(n-2, getFibonacciNum(n-2));
		
		int calculatedFibonacci = this.memoizeTable.get(n-1) +
				this.memoizeTable.get(n-2);
		
		this.memoizeTable.put(n, calculatedFibonacci);
		
		return calculatedFibonacci;
	}

}
