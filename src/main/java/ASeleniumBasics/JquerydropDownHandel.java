package ASeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		// common methods calling--Here
		selectChoiceValues(driver, "choice 1");
		selectChoiceValues(driver, "choice 6 2 1");
		selectChoiceValues(driver, "choice 4");

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		for (int i = 0; i < choiceList.size(); i++) {
			System.out.println(choiceList.get(i).getText());
			String text = choiceList.get(i).getText();
			if (text.equals("choice 1")) {
				choiceList.get(i).click();
				break;

			} // If ends

		} // LoopEnds

	}// MainMtehodEnds

	// 1.Generic method for Jqery Select..
	public static void selectChoiceValues(WebDriver driver, String value) {

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		for (int i = 0; i < choiceList.size(); i++) {
			System.out.println(choiceList.get(i).getText());
			String text = choiceList.get(i).getText();
			if (text.equals(value)) {
				choiceList.get(i).click();
				break;

			} // If ends

		} // LoopEnds

	} // MethodsEnds

}// Class Ends
