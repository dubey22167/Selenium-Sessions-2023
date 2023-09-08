package ASeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		//It will give total count of frame.
		List<WebElement>  listofframe= driver.findElements(By.tagName("frame"));
		System.out.println(listofframe.size());

		// There are three way to handle frame : with frame id/name , by index or we can
		// create webElement and then we can handle :--

		// 1. handling frame by webElement :::>>>> created a webElemnt by Xpath and used
		// to handle.
		WebElement frameElement = driver.findElement(By.xpath("//frame[@name='main']"));
		driver.switchTo().frame(frameElement);

		// 2. handling frame by Name/ID :::>>>>for this webSite ID is not there so used
		// name.
		// driver.switchTo().frame("main");

		// 3. handling frame by Index :::>>>> giving frame index--it depends how many
		// frames are there.
		// driver.switchTo().frame(2);

		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//body/h2[1]")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();// driver will point to main page from frame.
		Thread.sleep(5000);
		
		//driver.switchTo().parentFrame();// it will switch to parent frame if nested frame is there. 
		driver.close();
		
		

	}

}
