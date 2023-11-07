package ASeleniumBasics;

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

		// it will handle user actions;; like, double click ,right click, drag n drop,
		// mouse hover etc.
		Actions action = new Actions(driver);

		// it will mouse hover to element
		// build()-->> how many action want to build and then performed it. hence we use
		// build and perform.
		WebElement contentLink = driver.findElement(By.className("menulink"));
		action.moveToElement(contentLink).build().perform();
		Thread.sleep(3000);

		// it will click on element.
		WebElement singleVideos = driver.findElement(By.xpath("//a[normalize-space()='Single Videos']"));
		singleVideos.click();
		Thread.sleep(3000);

		driver.close();

	}

}
