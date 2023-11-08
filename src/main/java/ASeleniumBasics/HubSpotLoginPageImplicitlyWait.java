package ASeleniumBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageImplicitlyWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://app.hubspot.com/login");

		// Thread.sleep(5000);

		// applied for the all elements
		// global wait
		// dynamic wait

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		username.sendKeys("okaytesting@gmail.com");
		pass.sendKeys("123");
		loginButton.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// after this line for all elements wait time is
																		// 10sec

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // wait time will be zero.

	} // MainMethod End*

}// Class End
