package ASeleniumBasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUtilTest {

	// This class is used to use Util method.

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?r=101");

		Thread.sleep(3000);

//		//Day
//		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//		Thread.sleep(1000);
//		ArrayList<String> dayList= DropDownUtil.getDropdownvalues(day);
//		System.out.println(dayList);
//		
//		//Month
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		Thread.sleep(1000);
//		ArrayList<String> monthList= DropDownUtil.getDropdownvalues(month);
//		System.out.println(monthList);
//		
//		//Year
//		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//		Thread.sleep(1000);
//		ArrayList<String> yearList= DropDownUtil.getDropdownvalues(year);
//		System.out.println(yearList);
//		
//		
//		String date = "10-Jul-1994";
//	    String datVal[] = date.split("-");
//	    
//	    Thread.sleep(5000);
//		DropDownUtil.selectValueFromDropDownByText(day,datVal[0] );
//		DropDownUtil.selectValueFromDropDownByText(month,datVal[1] );
//		DropDownUtil.selectValueFromDropDownByText(year,datVal[2] );
		
		System.out.println("Select dropdwon without select class.");
		
		//WithoutSelect class
		
		String days = "//select[@id='day']/option";
		String months = "//select[@id='month']/option";
		String years = "//select[@id='year']/option";
		
		DropDownUtil.selectDropDownWithoutSelect(driver, days, "25");
		DropDownUtil.selectDropDownWithoutSelect(driver, months, "Jul");
		DropDownUtil.selectDropDownWithoutSelect(driver, months, "1994");
		System.out.println("Test case is pass");
		driver.close();
	}

}
