package ToolsQA;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionCheck {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//  driver.switchTo().newWindow(WindowType.TAB);
		//((JavascriptExecutor) driver).executeScript("window.open()");
	
//		And the how to open a new tab with URL:

		((JavascriptExecutor) driver).executeScript("window.open('https://google.com')");
	//	driver.navigate().to("https://www.google.com");
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Pass: title is Google");
		} else {
			System.out.println("Fail: title is not google.. Actual title is: " + title);

		}
		String url = driver.getCurrentUrl();
		if (url.contains("google.co.in")) {
			System.out.println("Pass: url has co.in");
		} else {
			System.out.println("Fail: url has no co.in.. Actual url is: " + url);

		}
		driver.navigate().back();
	}

}
