package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum3
{
	
	@Parameters({"a","b"})
	@Test
	public void div (int a, int b) {
		int d=a/b;
		System.out.println("Addition of two numbe r" +d);
	}

}
