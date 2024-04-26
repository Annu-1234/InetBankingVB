package ToolsQA;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void CarLoginWeb() {
		System.out.println("day3 Car web Login");
		Assert.assertTrue(false);
	}

	@Test
	public void CarLoginMobile() {
		System.out.println("day3 Car mobile login");
	}

	@Test
	public void CarAPILogin() {
		System.out.println("day3 Web API login");
	}

	@AfterSuite
	public void checkAftersuite() {
		System.out.println("I will be working last");
	}

	@Test(groups = { "smoke" })

	public void APILogin() {
		System.out.println("day3 API login");
	}

}
