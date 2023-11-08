package ASeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://app.hubspot.com/login");

		// Page object concept:-- Create the WebElement like this and use in program.
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		// Created class object of Util class to use Getelement method.
		Util util = new Util(driver);

		/*
		 * util.getElement(username).sendKeys("vijay22166@gmail.com");
		 * util.getElement(password).sendKeys("admin"); Thread.sleep(4000);
		 * util.getElement(loginBtn).click();
		 */

		util.waitForElementPresent(username, Duration.ofSeconds(30));// wait for element. 
		
		util.doSendKeys(username, "vijay@gmail.com");
		util.doSendKeys(password, "123");
		util.doClick(loginBtn);

		
		driver.close();

	}

}
