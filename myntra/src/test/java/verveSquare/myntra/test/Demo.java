package verveSquare.myntra.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void CheckDetails() {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Care\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement wb=driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		
		Actions as=new Actions(driver);
		as.moveToElement(wb).build().perform();
		
		WebElement wb1=driver.findElement(By.xpath("//a[@href=\"/mobile-phone-cases\"]"));

		wb1.click();
		
		driver.findElement(By.xpath("//a[@href=\"mobile-accessories/popsockets/popsockets-blue--white-printed-mobile-grip--stand/11202526/buy\"]")).click();
		System.out.println("Price is grater than 10 and ADD TO BUG Option available");
		
		
	}

}
