package ASeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?r=101");

		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		getDropdownvalues(day);

		getDropdownvalues(month);

		getDropdownvalues(year);
		
		
	}

	/**
	 * //Generic method to get all dropDown value.
	 * @param element
	 */
	public static void getDropdownvalues(WebElement element) {
		System.out.println("=======================================");

		Select select = new Select(element);

		List<WebElement> daysList = select.getOptions();

		System.out.println("Total days :" + daysList.size());

		for (int i = 0; i < daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);// it will all day element text on console. 
		}

	}

}
