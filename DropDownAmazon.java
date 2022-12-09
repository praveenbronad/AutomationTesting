package dropdowns;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver(); // Import WebDriver and Lunch Browser
		driver.manage().window().maximize(); // Maximize the Browser
		driver.get("https://www.amazon.in/");// Enter URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait
		
		WebElement dropDown= driver.findElement(By.id("searchDropdownBox")); // find drop down
		
		Select s= new Select(dropDown); // create Object for SelectClass and import 
		
		s.selectByValue("search-alias=todays-deals"); // Search by value
		Thread.sleep(3000);
		s.selectByIndex(2);// search by index
		Thread.sleep(3000);
		s.selectByVisibleText("Books");// search by visible text
		Thread.sleep(3000);
		
		
		List<WebElement> options = s.getOptions(); // get all the options in drop down
		
		System.out.println(options.size()); // get how many options are there in drop down
		
		for(WebElement b:options) // use for each loop for printing all options 
		{
			System.out.println(b.getText()); // get text 
		} 
		
		s.deselectAll();
		
		driver.close();// close appliaction 
	} 

}
