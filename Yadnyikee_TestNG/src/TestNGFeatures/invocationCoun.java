package TestNGFeatures;

import org.testng.annotations.Test;

public class invocationCoun {
	//this Invocationcount is like for loop. given number of time will execute the test case
		@Test(invocationCount = 5)
		public void Loginpage() {
			
			System.out.println("this is login page");
		}

}
