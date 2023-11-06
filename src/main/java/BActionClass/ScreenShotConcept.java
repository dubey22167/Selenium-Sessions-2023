package BActionClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(500);

		// Standard code for taking screenshots in Selenium
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("./target/screenshots/page.png"));

		takePageScreenShot(driver, "loginPage"); // pass the file name like loginPage, orderPage etc.

		WebElement username = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		takeElementScreenShot(loginButton, "loginbutton");
	}

	// 1*****PageScreenShot
	public static void takePageScreenShot(WebDriver driver, String FileName) {
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/" + FileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	// 2*** ElementScreenShot
	public static void takeElementScreenShot(WebElement element, String FileName) {
		File SrcFile = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/" + FileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
