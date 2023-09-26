package BActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		// Right click the button to launch right click menu
		// options:---->action.contextclick-for rightClick
		Actions action = new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(rightClick).build().perform();
		
		Thread.sleep(4000);
		WebElement clickonEdit = driver.findElement(By.xpath("//ul/li[contains(@class, 'context-menu-item context-menu-icon context-menu-icon-edit')]"));
		Thread.sleep(4000);
		action.moveToElement(clickonEdit).click().build().perform();

		driver.close();

	}

}
