package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Google {
	WebDriver driver;

	@Test
	public void Google_Jenkins() {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Krishna",Keys.ENTER);
	}
	@AfterTest
	public void close() {
		driver.quit();

	}
}
