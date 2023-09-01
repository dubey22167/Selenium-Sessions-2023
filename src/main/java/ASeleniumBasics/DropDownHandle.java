package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?r=101");

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(1000);
		
		
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		Thread.sleep(1000);
//		
//		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

//		Select select = new Select(day);
//		select.selectByVisibleText("10");

//		Select select1 = new Select(day);
//		select.selectByVisibleText("10");
//		
//		Select select2 = new Select(day);
//		select.selectByVisibleText("10");

//		Select select3 = new Select(day);
//		select2.selectByIndex(8); ///////////// Index can be changed so always prefer by text only.
		
//		selectValueFromDropDownByText(day, "10");
//		selectValueFromDropDownByText(month, "Jul");
//		selectValueFromDropDownByText(year, "1994");
		
		Select select4 = new Select(day);
		Boolean b = select4.isMultiple();
		System.out.println(b);
		
		Thread.sleep(4000);
		driver.close();

		
		
		
	}

	// This is generic method for select dropDown..>> using this we do not need to
	// write multiple select class.

	//ByText
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}
	
	//2.ByIndex
	public static void selectValueFromDropDownByIndex(WebElement element, int indexNum) {
		Select select = new Select(element);// we need pass argument as element 
		select.selectByIndex(indexNum);// need pass the argument of value like index or text.

	}

}
