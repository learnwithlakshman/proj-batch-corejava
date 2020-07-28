package com.lwl.cj.task1;

public class NumberOperations {

	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public float sumOfSeries(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		float sum = 1.0f;
		for (int i = 2; i <= n; i++) {
			sum += 1 /(float)i;
		}
		return sum;
	}
	
	// Return number of primes in range  2 10 => 2 3 5 7 => 4
	public int primeNumbersInRange(int lb,int ub) {
		
		return 0;
	}
	
	// 1/23+1/33+1/43……..+1/n3.
	public double sumOfSeriesWithPower(int n) {
		
		return 0.0;
		
	}
	
	// n = 3 => 1 + 1 + 2 => 4
	public int fibonacciSum(int n) {
		
		return 0;
	}
	
	// num = 123 => 321
	public int reverseOfNumber(int num) {
		
		return 0;
	}
	// num = 9981 => 36 => 9
	public int sumOfDigitsUntilSingleSum(int num) {
		
		return 0;
	}
	
	// m =2, n = 3 => 8
	public long power(int m,int n) {
		return 0;
	}
	
	// 123 => 234  // 298 => 209
	public int incrementDigit(int num) {
		return 0;
	}
	// n = 3 
	/*
	 *    1
	 *   121
	 *  12321 
	 */
	public String printPattern(int n) {
		
		return "";
	}
	
}
