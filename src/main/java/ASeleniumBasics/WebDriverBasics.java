package ASeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VijayChromeD\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Test case logic code
		driver.get("http://google.com");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		String title = driver.getTitle();
		Thread.sleep(3000);

		driver.close();// it will only close the current window where driver is available . Not all.
		//driver.quit();// Closing every associated window.

		// Test Case validation
		if (title.equals("Googlee")) {
			System.out.println("Google title test case is:- PASS");
		}

		else {
			System.out.println("Google title test case is:- FAIL");
		}

	}

	
	/*
	 * //To change the font size in the Java text editor in Eclipse, follow these
	 * steps: Go to the Window menu and select Preferences . In the Preferences
	 * window, go to General -> Appearance -> Colors and Fonts . In the Colors and
	 * Fonts window, scroll down and select Java Editor Text Font . Click the Edit
	 * button.
	 */
}
