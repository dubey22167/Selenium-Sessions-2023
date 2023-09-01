package ASeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("Http://www.amazon.in");
		Thread.sleep(5000);
		
		//Get all links available on web page 
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total number of list " + ": "+ linksList.size());
		Thread.sleep(4000);
		
		//It will print all links text:->>
		for (int i=0; i<linksList.size(); i++) {
			String text = linksList.get(i).getText();
			System.out.println(text);
		}
		//driver.close();
		
	}

}
