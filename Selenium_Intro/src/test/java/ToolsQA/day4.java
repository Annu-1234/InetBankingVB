package ToolsQA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	/*
	 * If we run below code with class then will give error "Parameter 'URL' is
	 * required by @Test on method WebloginCarLoan but has not been marked @Optional
	 * or defined " because it have dependency on xml file and we are only executing
	 * class
	 */

	// Specify the parameter names in the @Parameters annotation
	@Parameters({ "URL", "APIKey" })
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		// Selenium logic
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test(dataProvider = "getData")

	public void signoutTest(String username, String password)

	{

		System.out.println("Good Afternoon");
		System.out.println(username);
		System.out.println(password);

	}

	@DataProvider
	public Object[][] getData() {
		// 1st combiantion - username password - good credit history= row
		// 2nd - username password - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// couloumns in the row are nothing but values for that particualar
		// combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;

	}

}
