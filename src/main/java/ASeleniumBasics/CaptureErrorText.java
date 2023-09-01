package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureErrorText {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys("ajay22167@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ram@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i18n-string[normalize-space()='Log in']")).click();

		Thread.sleep(5000);

		// get alert "error message text" and apply if conditions for validation.
		String text = driver.findElement(By.xpath("(//h5[normalize-space()=\"That email address doesn't exist.\"])[1]"))
				.getText();
		System.out.println(text);
		driver.close();// it will only close the window where driver is available . Not all. 
	}

}
