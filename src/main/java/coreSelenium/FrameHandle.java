/**frame handling in java its not a big deal :)
 *  frame is basically in web pages like frame inside the another frame 
 *  so how to know that theres a frame on yoour web page for that right clik on
 *   particular element either you will see 
 *  frame source option or if theres no option go to the dom look for the parent of the html tag
 *   then yo will see some frame there 
 *  remember one thing frame also web element its not a javascript element or some pop up 
 *  to pass the frame we have switchTo().frame method ----->>> frame method here is method overloading 
 *  it has webElement method , string name, int index 
 *  and when i use one of these method to switch the frame always its good practice to come back to the frame were u start 
 *  for that need to use 	driver.switchTo().defaultContent(); method 
 *  
 *  another question how to know how many frames are available in my webpage for that 
 *  driver.findelement(By.(tagname))   and pass the frame name to the tag thne u will know how many 
 *  frmaes you have in your webAplication 
 * 
 */


package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//WebElement frameElement = driver.findElement(By.name("main"));
		
		//driver.switchTo().frame(frameElement);
		
		//driver.switchTo().frame("main");
		
		driver.switchTo().frame(2);
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
	}

}