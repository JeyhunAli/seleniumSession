/**
 * Mouse over action class 
 * this class is available in selenium not in java
 * in action class once we declare the action class inside to the parenthesis we pass driver 
 * but in select class we pass WebElement 
 * action class purpose to handle all user define actions it means double click right click mouse over how to 
 * move specicfic element how to do drag and drop 
 * after using action class always need to use .buld.perform methods 
 * return type of the movetoelement is Action 
 * 
 * 
 */


package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Actions action = new Actions(driver);
		
		WebElement contentLink = driver.findElement(By.className("menulink"));
		
		action.moveToElement(contentLink).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
	}

}