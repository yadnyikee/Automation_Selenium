package FailTestCaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {
	@Test
	public void Test1() {
		System.out.println("Test 1");
		Assert.assertEquals(true, false);
	}
	@Test
	public void Test2() {
		System.out.println("Test 2");
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test3() {
		System.out.println("Test 3");
		Assert.assertEquals(true, true); 
	}

}
