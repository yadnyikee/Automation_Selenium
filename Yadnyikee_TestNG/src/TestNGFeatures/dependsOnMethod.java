package TestNGFeatures;

import org.testng.annotations.Test;

public class dependsOnMethod {
	
	
	@Test(expectedExceptions= Exception.class)
	public void logintest() {
		System.out.println("login test1");
		int i= 1/0;
		System.out.println("aaaaaaa");
		
	}
	@Test(dependsOnMethods="logintest")
	public void Searchtext() {
		System.out.println("Search text1");
		
	}
	@Test(dependsOnMethods="logintest")
	public void HomePage() {
		System.out.println("Home Page1");
		
	}
	@Test
	public void RefereshPage() {
		System.out.println("Referesh Page");
		
	}
	

}
