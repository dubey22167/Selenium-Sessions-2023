package ASeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//1.to handle Auth popup . we need to pass username and pass in url only.
		// for ex: after https://admin:admin@ this is my user name and pass. 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		
		//2. we can handle like this as well.
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+ ":" +password+"@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
