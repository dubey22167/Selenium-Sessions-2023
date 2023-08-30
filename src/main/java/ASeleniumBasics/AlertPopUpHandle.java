package ASeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();

		//only for javascript popup. 
		Alert alert = driver.switchTo().alert(); // alert is interface can create object but can create refrence.
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct error mesaage ");
		}

		else {
			System.out.println("Error message is not correct");
		}

		Thread.sleep(2000);
		alert.accept();// click on Ok button
		// alert.dismiss();// cancel the alert
		driver.close();

	}

}
