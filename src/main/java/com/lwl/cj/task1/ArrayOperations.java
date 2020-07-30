package com.lwl.cj.task1;

public class ArrayOperations {

	public int maxElement(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// This method should return min value of the given array
	public int minElement(int[] arr) {

		return 0;
	}

	// This method should return the sum of all the elements of an array
	public int sumElements(int[] arr) {

		return 0;
	}

	// If it is zero ignore don't multiply
	public int productElements(int[] arr) {
		int prod = 1;
		for (int i : arr) {
			if (i != 0) {
				prod *= i;
			}
		}
		return prod;
	}

	// If the ele is found then it should return index of the element, otherwise
	// should return -1
	public int search(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i])
				return i;
		}
		return -1;
	}

	// This method should return true if all the sub array elements present in the
	// given, otherwise it should return false
	public boolean search(int[] arr, int[] subArr) {

		return false;
	}

	// This method should return number of prime numbers in the given array
	public int countPrimeNumber(int[] arr) {
		return 0;
	}
	/*
	 * [1,2,3,4,5,6,7,8] n = 3 [1,2,3], [2,3,4],[4,5,6],[6,7,8] => 21
	 * 
	 * [1,5,8,9,1] n = 2 [1,5] , [5,8], [8,9], [9,1] => 17
	 * 
	 */

	public int maxSum(int[] arr, int n) {
		return 0;
	}
	
	// This method return array of prime integers in the given range
	public int[] generatePrime(int lb, int ub) {

		return null;
	}
	
	// Find the sum of all the element of the given array
	public int sumOfElement(int[][] arr) {
		return 0;
	}
	
	// Find the biggest element of the given array
	public int biggest(int[][] arr) {
		return 0;
	}
	
	public int diagonalSum(int[][] arr) {
		return 0;
	}
	/*
	 * [[1,2,3],[0,1,3] [3,0,0]]
	 */
	public int[] maxSumElementRow(int[][] arr) {
		return null;
	}

}
