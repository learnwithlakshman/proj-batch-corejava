package com.lwl.cj.task1.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lwl.cj.task1.ArrayOperations;

public class ArrayOperationTest {

	
		ArrayOperations obj;
		
		@BeforeEach
		public void init() {
			obj = new ArrayOperations();
		}
		
		@Test
		public void maxElementWithPnumbers() {
			int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
			int res = obj.maxElement(arr);
			assertThat(res,is(10));
		}
		@Test
		public void maxElementWithNnumbers() {
			int[] arr = new int[] {-1,-2,-33,-44};
			int res = obj.maxElement(arr);
			assertThat(res,is(-1));
		}
		
		
}
