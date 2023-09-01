package ASeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	// Press control+O to see method count in class.

	/**
	 * This is class is used to select dropDown on the basis of given VisibleText
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	/**
	 * This is class is used to select dropDown on the basis of given Index
	 * 
	 * @param element
	 * @param indexNum
	 */
	// 2.ByIndex
	public static void selectValueFromDropDownByIndex(WebElement element, int indexNum) {
		Select select = new Select(element);// we need pass argument as element
		select.selectByIndex(indexNum);// need pass the argument of value like index or text.

	}

	/**
	 * //Generic method to get all dropDown value.
	 * 
	 * @param element
	 */
	public static ArrayList<String> getDropdownvalues(WebElement element) {
		System.out.println("=======================================");

		Select select = new Select(element);
		List<WebElement> daysList = select.getOptions();
		System.out.println("Total days :" + daysList.size());

		ArrayList<String> ar = new ArrayList<String>();// created arrayList to store all values from dropDown

		for (int i = 0; i < daysList.size(); i++) {
			String text = daysList.get(i).getText();
			ar.add(text);// adding list in ArrayList
		}

		return ar;

	}

	/**
	 * This method is used to select the value from drop down without select class.
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 * @throws InterruptedException
	 */
	public static void selectDropDownWithoutSelect(WebDriver driver, String locator, String value)
			throws InterruptedException {

		List<WebElement> dropList = driver.findElements(By.xpath(locator));
		System.out.println(dropList.size());
		Thread.sleep(1000);
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);

			if (text.equals(value)) {
				dropList.get(i).click();
				break;
			}
		}
	}

}
