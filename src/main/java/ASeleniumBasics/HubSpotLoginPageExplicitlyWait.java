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
		
		System.out.println(driver.getTitle());

		// By username = By.id("usernamess");

		By username = By.id("username");

		// ExplicitlyWaitCode:-
		// It will be applied for a specifiq element not for all.
		// It will be TimeoutException: if not found.
		// It will work to get title if it is taking lobg time
		// it will work for url also if we want to get URL.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(username));

		// Expected condition failed: waiting for presence of element located by: By.id:
		// usernamess (tried for 30 second(s) with 500 (0.5--Seconds default interval
		// time) milliseconds interval)
		// NoSuchElementException: no such element: Unable to locate element:
		// {"method":"css selector","selector":"#usernamess"}
		// I have given the wrong Id for element so wait for 30 sec.

		WebElement userid = driver.findElement(username);
		userid.sendKeys("test@gmail.com");

		// WebElement username = driver.findElement(By.id("username"));
		// WebElement pass = driver.findElement(By.id("password"));
		// WebElement loginButton = driver.findElement(By.id("loginBtn"));

		driver.close();

	} //MainMethodEnd

}//Class End
