package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	WebDriver driver;

	/**
	 * Initialize Webdriver using Constructor.
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

} // Class End***
