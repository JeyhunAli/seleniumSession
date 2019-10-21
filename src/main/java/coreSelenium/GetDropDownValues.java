package coreSelenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);

	}
//	to get all the value from drop down we can use    "getOption method"   return type of the get option method is list Webelement
//	  let say i have requirement to get all the drop down values 
//	for multiple drop down values i can cretae generic user define method i ll pass select option then i ll store it in list webelement 
//	then for loop 

	/**
	 * return type of the get.Options is List<WebElement>  
	 * This method is used to get all the values from drop down
	 * @param element
	 */
	public static void getDropDownValues(WebElement element) {
		System.out.println("===============================");
		Select select = new Select(element);

		List<WebElement> dropList = select.getOptions();
		System.out.println("total number of values in drop down: " + dropList.size());   //to get the number of the elements size 

		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();    //to get all the value by text 
			System.out.println(text);
		}
	}

}