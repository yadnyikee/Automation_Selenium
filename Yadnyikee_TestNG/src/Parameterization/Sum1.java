package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum1
{
	
	@Parameters({"a","b"})
	@Test
	public void Sum (int a, int b) 
	{
		int c= a+b;
		System.out.println("Addition of two numbe r" +c);
	}

}
