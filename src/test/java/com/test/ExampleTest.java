package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		int score = 80;
		String expected = "A";
		
		String actual = "A";
		
		Assert.assertEquals(expected, actual);
		
	}

}
