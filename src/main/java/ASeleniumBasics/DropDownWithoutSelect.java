package ASeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?r=101");

		Thread.sleep(3000);

		List<WebElement> daysList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(daysList.size());
		Thread.sleep(1000);

		for (int i = 0; i < daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);

			if (text.equals("25")) {
				daysList.get(i).click();
				break;
			}
		}

	}

}
