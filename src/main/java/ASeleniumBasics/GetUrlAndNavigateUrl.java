package ASeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndNavigateUrl {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\VijayChromeD\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Browser launching---->>>>
		// driver.get("https://amazon.in/");// it will wait till page load
		// Thread.sleep(2000);

		// System.out.println(driver.getTitle());// once the page loaded then we will
		// get title

		driver.navigate().to("https://amazon.in/");
		System.out.println(driver.getTitle()); // it will not wait until page load it will print immediate title of
												// page.

		
		// in real time we use driver.get only
		
		
	}

}
