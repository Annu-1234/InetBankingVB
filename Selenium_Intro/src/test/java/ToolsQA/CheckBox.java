package ToolsQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com");
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Elements')]")));
		Thread.sleep(6000);  
		driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();

		Thread.sleep(5000);

//		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
//		driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]")).click();
//		driver.findElement(By.xpath("//span[text()='Office']")).click();
//		driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[5]")).click();
//
//		driver.findElement(By.xpath("//span[text()='Classified']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//li[@class='btn btn-light '] //span[text()='Radio Button']")).click();
	}

}
