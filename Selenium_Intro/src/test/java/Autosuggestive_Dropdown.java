import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown {
	
	public static void main(String args[]) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//	driver.findElement(By.className("signInBtn")).click();
//	driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	
	//Handling autosuggestive Dropdown code
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	Thread.sleep(4000);
	List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

	for(WebElement option:options)
	{
		if(option.getText().equalsIgnoreCase("India"))
		{		option.click();
		break;
		}
	}

	
}
}