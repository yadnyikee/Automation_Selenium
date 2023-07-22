package DataProvider;

import org.testng.annotations.DataProvider;

public class ORSecond_demoData {
	@DataProvider(name = "Logindata")
	public String[][] LoginData() {   // here we put object datatype also 
		String LoginD[][] = { { "abc@gmail.com", "admin" }, { "xyz@gmail.com", "admin" },
				{ "pal@gmail.com", "admin123" } };

		return LoginD;

	}

}
