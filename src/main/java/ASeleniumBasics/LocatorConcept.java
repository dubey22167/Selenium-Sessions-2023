package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\VijayChromeD\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.edge.driver", "D:\\VijayChromeD\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://app.hubspot.com/login");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 1.ID-->I it is a properties and have value
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("sgss22167@gmail.com");
		 * 
		 * WebElement pass = driver.findElement(By.id("password"));
		 * pass.sendKeys("Ramsita@1994");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement login = driver.findElement(By.id("loginBtn")); login.click();
		 */

		// 2.Name-->II it is a properties and have value
		// driver.findElement(By.name("email")).sendKeys("vijay1911");

		// 3.Xpath-->III
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123");

		// 4.CssSelector-->III
		// driver.findElement(By.cssSelector("#username")).sendKeys("12345");

		// 5.Class-->IV it is a cascated class ( Many class with spaces) with space in
		// class we can not use.
		// driver.findElement(By.className("form-control private-form__control
		// login-email")).sendKeys("username");

		// we need to use unique class name
		driver.findElement(By.className("login-email")).sendKeys("username");

		// 6.LinkText--> It is only used for links--<a href> -- this is the link all
		// link represented by a (anchor)tag
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(4000);

		driver.navigate().to("https://app.hubspot.com/login");

		// 7.PartialLinktext--> we use this if link text is big" sign up with google
		// account"
		driver.findElement(By.partialLinkText("Sign")).click();

		// 8.TagName-->
	}

}
