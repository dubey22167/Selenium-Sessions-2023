package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		// Chrome driver----->>>>
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		// Edge browser----->>>>>>
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);

		WebElement sourceElement = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));

		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);

		// 1-->>.
		// Drag>>hold and release
		// action.clickAndHold(sourceElement).release(targetElement).build().perform();

		// 2-->>.
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
