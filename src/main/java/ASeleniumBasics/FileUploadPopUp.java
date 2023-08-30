package ASeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(2000);
		
		//type= file attribute should be there in html tag then it will work. 
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\SGSLP047\\OneDrive - SteepGraph Systems Pvt Ltd\\Documents\\01_Testing Screenshotes\\Baseline latest report.png");

		Thread.sleep(10000);

		driver.close();
	}

}
