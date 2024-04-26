import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.findElement(By.xpath("//div[text()='Currency')]")).click();
		Thread.sleep(5000);
//		Select dropdown= new Select(driver.findElement(By.xpath("//div[text()='Currency']")));
//		dropdown.selectByVisibleText("AED");
//		Select dropdown= new Select(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']")));
//		dropdown.selectByVisibleText("AED");	
		driver.findElement(By.xpath("//div[text()='To']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='AGR']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Family & Friends']")).isDisplayed());

		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Family & Friends']")).isDisplayed());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid=\"round-trip-radio-button\"]")).click();
		
	}

}
