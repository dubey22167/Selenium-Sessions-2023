package ASeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);

		driver.findElement(By.id("windowButton")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();// it will point window id

		Thread.sleep(3000);
		String parentWindowID = it.next();// it will move to next window id(Parent)
		System.out.println("parentWindow id is " + " :" + parentWindowID);

		Thread.sleep(3000);
		String childtWindowID = it.next();// it will move to next window id(child)
		System.out.println("childtWindow id is " + " :" +childtWindowID);

		Thread.sleep(3000);
		driver.switchTo().window(childtWindowID); // it will switch to childtWindow
		Thread.sleep(3000);
		System.out.println("It is a child window title"+ " :" + driver.getTitle());
		driver.close();

		Thread.sleep(3000);
		driver.switchTo().window(parentWindowID);// it will switch to parentWindow
		System.out.println("It is a parent window title" + " :" + driver.getTitle());
		driver.close();// control of the driver where available that window will be closed. 
		//driver.quit();// All windows will be closed.

	}

}
