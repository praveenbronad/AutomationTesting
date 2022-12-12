/*Automation Scenario: SnapDeal--> Frame Handling 
 * 1. open the browser
 * 2. ENter url of snapdeal.com
 * 3. Mouse hover to signIn 
 * 4. click on login
 * 5. switch the control to the frame type the phone no in text field
 * 6. Click on close pop up icon 
 * 7. Switch  the frame to default and type "Phone " in Search text Filed 
 * 8. close driver
 */
package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// move hover to sign in 
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		
		// find login element  and click 
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(3000);
		
		// switch control to frame
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		// type phone no
		driver.findElement(By.id("userName")).sendKeys("12345678");
		Thread.sleep(3000);
		
		// click on close pop up icon 
		
		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(3000);
		// Swith control back to default 
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		// type phone in the text field 
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Phone");
		Thread.sleep(3000);
		
		// close application
		driver.close();
		

	}

}
