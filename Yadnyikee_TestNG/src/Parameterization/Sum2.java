package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum2
{
	
	@Parameters({"a","b"})
	@Test
	public void Sub (int a, int b) {
		int S= a-b;
		System.out.println("Addition of two numbe r" +S);
	}

}
