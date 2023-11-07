package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) throws InterruptedException {

		// Edge browser----->>>>>>
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://app.hubspot.com/login");
				
				WebElement username = driver.findElement(By.id("username"));
				WebElement pass = driver.findElement(By.id("password"));
				WebElement loginButton = driver.findElement(By.id("loginBtn"));
				Actions action = new Actions (driver);
				
				action.sendKeys(username, "admin12346@gmail.com").build().perform();
				action.sendKeys(pass, "admin@12346").build().perform();
				action.click(loginButton).build().perform(); // it will mouse hover in middle of element and then click. 
				
				
				Thread.sleep(3000);
				driver.close();
				
				
				
				

	}

}
