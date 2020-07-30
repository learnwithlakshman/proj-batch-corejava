package com.lwl.cj.task1.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;
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
		boolean expecteRes = true;
		boolean res = obj.isPrime(17);
		assertThat(expecteRes, is(res));
	}

	@Test
	public void isPrimeWithNnumber() {
		boolean res = obj.isPrime(-17);
		assertThat(false, is(res));

	}

	@Test
	public void isPrimeWithEvenNumber() {
		boolean res = obj.isPrime(18);
		assertThat(false, is(res));
	}

	@Test
	public void isPrimeWithZero() {
		boolean res = obj.isPrime(0);
		assertThat(false, is(res));
	}

	@Test
	public void isPrimeWithOne() {
		boolean res = obj.isPrime(1);
		assertThat(false, is(res));
	}

	@Test
	public void isPrimeWithTwo() {
		boolean res = obj.isPrime(2);
		assertThat(true, is(res));
	}

	@Test
	public void sumOfSeriesWithOne() {
		float res = obj.sumOfSeries(1);
		assertThat(1.0f, is(res));
	}

	@Test
	public void sumOfSeriesWithTwo() {
		float res = obj.sumOfSeries(2);
		assertThat(1.5f, is(res));
	}

	@Test
	public void sumOfSeriesWithZero() {
		float res = obj.sumOfSeries(0);
		assertThat(0.0f, is(res));
	}

	@Test
	public void sumOfSeriesWithFour() {
		float res = obj.sumOfSeries(4);
		assertThat(2.083, closeTo(res, 0.05));
	}

}
