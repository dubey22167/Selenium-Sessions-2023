package ASeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\VijayChromeD\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser launching
		driver.get("http://google.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().to("https://amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().refresh();

		driver.close(); // close browser

	}

}
