package com.qa.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum()
	{
		System.out.println("Sum----------------->>>>>>>>>>>>>>>>>>>>>");
		Reporter.log("Hellooooooooooooooooooooooooooooooooooooooooooo");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.println("Sub----------------->>>>>>>>>>>>>>>>>>>>>");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
}
