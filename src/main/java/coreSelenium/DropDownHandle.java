
//drop down handling 
//findelement returning webelement so we can store in web elemenet later on we can print it out some message 
// for handling drop down we have to use select class which is alredy available in selenium 
//this selct class says theres no default constructor in selelct class i have to pass the web elmenet to the paranthesis
//always need to remember whenever i create select class need to pass web element

//another way handling drop down still im using selct class but this time i create my own method i pass web element and some value 
//calling select class passing element and value then i make my method as static so outside of the method i call method 
//name directly then passing web element and value 
//advantages of creating generics method lets say i have multiple drop down for each and every of them no need to create select class 
//in select class there select by visible text and select by index both is doing same action but first one is more 
//effective why because select by index lets say in country name or some other element added in the fututre  position is changed 
//then its gonna give error 



package coreSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		//select.selectByVisibleText("5");
		//select.selectByIndex(10);
//
		//Select select1 = new Select(month);
//		select1.selectByVisibleText("May");
		//select1.selectByIndex(8);
//
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1995");
		
		selectValueFromDropDownByText(day, "5");
		selectValueFromDropDownByText(month, "May");
		selectValueFromDropDownByText(year, "1990");
		
		System.out.println(select.isMultiple());
		

	}

	/**
	 * This method is used to select the value from a drop down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
//	public static void selectValueFromDropDownByIndex(WebElement element, int index) {
//		Select select = new Select(element);
//		select.selectByIndex(index);
//	}

}