package ASeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in");

		//Images always start with <img> tag name
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("all imgList : " + imgList.size());//totlanumber of images on webpage

		//Here we are taking all available images url and printing on console. 
		for (int i = 0; i < imgList.size(); i++) {
			String imageURL = imgList.get(i).getAttribute("src");
			System.out.println(imageURL);
		}

	}

}
