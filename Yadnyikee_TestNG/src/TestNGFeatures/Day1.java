package TestNGFeatures;

import org.testng.annotations.Test;

public class Day1 {
	@Test(groups= {"smoke"}, enabled=true)
	public void Test1() {
		
		System.out.println("hello");
	}
	@Test(groups= {"smoke"})
	public void Test5() {
		System.out.println("Day 1---Test5");
	}
	@Test(groups ="Regression")
	public void Test7() {
		System.out.println("Reg hello");
	}

}
