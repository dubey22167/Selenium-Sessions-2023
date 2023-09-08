package BActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/search/");
		
		//it will handle user actions;; like, double click ,right click, drag n drop, mouse hover etc.
		Actions action = new Actions(driver);
		
		//it will mouse hover to element
		WebElement element =driver.findElement(By.className("menulink"));
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		
		//it will click on element.
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='Single Videos']"));
		action.moveToElement(element1).click().build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
