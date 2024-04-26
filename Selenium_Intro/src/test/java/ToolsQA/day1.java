package ToolsQA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	

	
	@Test(enabled=false) //it will of the test ie: test will not exeecuted 
	public void check() {
		System.out.println("sysout");
	}

	@AfterTest
	public void WebLappiLogin() {
		System.out.println("I will execute last");
	}

	@Test
	public void TestCheck() {
		System.out.println("Mobile login");
	}

	@BeforeSuite
	public void TestFirstsuite(){
		System.out.println("I will be no 1");
	}

	@BeforeClass
	public void BeforeeveryClass()
	{
		System.out.println("I will be executed before every method in the class");
	}
	
	@AfterMethod //run after every method
	public void TestFirstMethod(){
		System.out.println("I will be last method");
	}

	@AfterClass //method will be ecxecuted after every method in class
	public void AftereveryClass()
	{
		System.out.println("I will be executed after every method in the class");
	}
	
	@Test
	public void laptop()
	{
		System.out.println("Hi..");
	}
	@BeforeMethod
	public void BeforeTest()
	{
		System.out.println("Test will execute every method");
	}
	
	@BeforeTest
	public void APIFoodLogin() {
		System.out.println("I will execute first");
	}

	@Test(dependsOnMethods= {"laptop"})  //it will make sure first laptop method will run then below code will run
	
		public void checkDependency()
		{
		System.out.println("I will execute first because dependency is with me for laptop");

		}
	
}
