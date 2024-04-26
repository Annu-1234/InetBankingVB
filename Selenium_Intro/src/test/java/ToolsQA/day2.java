package ToolsQA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class day2 {


	@Test
	public void check() {
		System.out.println("checkkk");
	}

	@AfterTest
	public void WebLappiLogin() {
		System.out.println("I will execute last");
	}

	@Test(groups = { "smoke" })

	public void TestCheck() {
		System.out.println("Mobile login");
	}

	@BeforeSuite
	public void TestFirstsuite() {
		System.out.println("I will be no 1");
	}

	@BeforeClass
	public void BeforeeveryClass() {
		System.out.println("I will be executed before every method in the class");
	}

	@AfterMethod
	public void TestFirstMethod() {
		System.out.println("I will be last method");
	}

	@AfterClass
	public void AftereveryClass() {
		System.out.println("I will be executed after every method in the class");
	}

	@Test(groups = { "smoke" })
	public void laptop() {
		System.out.println("Hi..");
	}

	@BeforeMethod
	public void BeforeTest() {
		System.out.println("Test will execute every method");
	}

	@BeforeTest
	public void APIFoodLogin() {
		System.out.println("I will execute first");
	}

}
