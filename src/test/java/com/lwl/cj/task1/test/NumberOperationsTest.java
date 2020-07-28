package com.lwl.cj.task1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lwl.cj.task1.NumberOperations;

public class NumberOperationsTest {

		public NumberOperations obj;
		
		@BeforeEach
		public void init() {
			obj = new NumberOperations();
		}
	
		@Test
		public void isPrimeWithPrimeNumber() {
			boolean res = obj.isPrime(17);
			Assertions.assertEquals(true, res);
		}
		
		@Test
		public void isPrimeWithNnumber() {
			boolean res = obj.isPrime(-17);
			Assertions.assertEquals(false, res);
		}
		@Test
		public void isPrimeWithEvenNumber() {
			boolean res = obj.isPrime(18);
			Assertions.assertEquals(false, res);
		}
		@Test
		public void isPrimeWithZero() {
			boolean res = obj.isPrime(0);
			Assertions.assertEquals(false, res);
		}
		@Test
		public void isPrimeWithOne() {
			boolean res = obj.isPrime(1);
			Assertions.assertEquals(false, res);
		}
		
		@Test
		public void isPrimeWithTwo() {
			boolean res = obj.isPrime(2);
			Assertions.assertEquals(true, res);
		}
		
		@Test
		public void sumOfSeriesWithOne() {
			float res = obj.sumOfSeries(1);
			Assertions.assertEquals(1, res);
		}
		@Test
		public void sumOfSeriesWithTwo() {
			float res = obj.sumOfSeries(2); 
			Assertions.assertEquals(1.5f, res);
		}
		
		@Test
		public void sumOfSeriesWithZero() {
			float res = obj.sumOfSeries(0); 
			Assertions.assertEquals(0, res);
		}
		
		@Test
		public void sumOfSeriesWithFour() {
			float res = obj.sumOfSeries(4);  // 1 + 1/2 + 1/3 + 1/4 => 1 + 0.5 + 0.33 + 0.25 => 2.08 
			Assertions.assertEquals(2.083, res,0.001);
			
		}
		
		
		
		
		
}
