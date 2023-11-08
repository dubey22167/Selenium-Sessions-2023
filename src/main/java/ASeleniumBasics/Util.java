package ASeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;

	/**
	 * Initialize Webdriver using Constructor.
	 * 
	 * @param driver
	 */
	public Util(WebDriver driver) {
		this.driver = driver;

	}

	/**
	 * 2 This method is used to create the WebElement on the basis of By locator.
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {

		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some exception occured while creating the WebElement");
			System.out.println(e.getMessage());
		}
		return element;

	}

	/**
	 * 3 This method is used to click on WebElemnt
	 */

	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Some exception occured while clicking on element");
			System.out.println(e.getMessage());
		}
	}

	// **** "Type /** and hit enter"

	/**
	 * 4 This method is used to pass the values in WebElemnt.
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {

		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some exception occured while sending keys ");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * 5 waitForElementPresent Explicitly wait Method.
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public void waitForElementPresent(By locator, Duration timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	 * 6 waitForTitletPresent for the webPage--
	 * 
	 * @param title
	 * @param timeOut
	 */
	public String waitForTitletPresent(String title, Duration timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();

	}

} // Class End***
