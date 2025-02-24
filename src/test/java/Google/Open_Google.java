package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Google {
	WebDriver driver;

	@BeforeTest
	public void NavigateToUrl() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void Google() {
		driver.findElement(By.id("APjFqb")).sendKeys("Krishna",Keys.ENTER);
	}
	@Test(priority=2)
	public void Gmail() throws Exception {
		driver.navigate().back();
		driver.findElement(By.id("APjFqb")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("Gmail",Keys.ENTER);
	}
	@AfterTest
	public void close() {
		driver.quit();

	}
}
