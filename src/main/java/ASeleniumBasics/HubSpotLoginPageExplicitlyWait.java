package ASeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitlyWait {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://app.hubspot.com/login");

		By username = By.id("username");

		// ExplicitlyWaitCode:-
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(username));

		WebElement userid = driver.findElement(username);
		userid.sendKeys("test@123");

		// WebElement username = driver.findElement(By.id("username"));
		// WebElement pass = driver.findElement(By.id("password"));
		// WebElement loginButton = driver.findElement(By.id("loginBtn"));

	}

}
