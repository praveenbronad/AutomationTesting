package dropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); // Import WebDriver and Lunch Browser
		driver.manage().window().maximize(); // Maximize the Browser
		driver.get("https://www.facebook.com/");// Enter URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait
		
		// find lement Create new Account and click
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// Select drop down 
		
		WebElement dd= driver.findElement(By.id("month"));
		
		Select s = new Select(dd);
		
		// select Options 
		
		s.selectByIndex(2);
		s.selectByValue("5");
		s.selectByVisibleText("Aug");
		
		
		// count options and print 
		
		List<WebElement> options = s.getOptions();
		
		// create array list
		
		ArrayList a= new ArrayList();
		
		for(WebElement o : options)
		{
			String text = o.getText();
			System.out.println(text);
			a.add(text);
		}
		
		// print xount 
		
		System.out.println(options.size());
		
		// check wehter it is single or multiple select drop dwn
		
		System.out.println(s.isMultiple());
		
		// sort options 
		
		Collections.sort(a);
		
		//print sorted options 
		for( Object o: a )
		{
			System.out.println(o);
		}
		
		driver.close();
		
		
		
		

	}

}
