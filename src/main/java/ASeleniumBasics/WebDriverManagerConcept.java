package ASeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// WebDriverManager.edgedriver().setup();
		// WebDriver driver = new EdgeDriver();

		
		//Get WebDriverManager dependency--->
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.5.0");
		Thread.sleep(1000);
		driver.close();

	}

}
