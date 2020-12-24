package verveSquare.myntra.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void CheckDetails() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Care\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.partialLinkText("Men"));
		Select men=new Select(wb);
		men.selectByIndex(0);
		
		driver.findElement(By.partialLinkText("Phone Cas")).click();
		driver.findElement(By.cssSelector("div.application-base:nth-child(1) main.search-base div.row-base:nth-child(3) div.search-rightContainer.column-base div.search-searchProductsContainer.row-base ul.results-base li.product-base:nth-child(11) div.product-imageSliderContainer div.product-sliderContainer div:nth-child(1) div:nth-child(1) picture.img-responsive > img.img-responsive:nth-child(2)")).click();
		System.out.println("Price shoud be grater then 10 ");
		driver.findElement(By.cssSelector("div.application-base main.pdp-pdp-container div.pdp-details.common-clearfix div.pdp-description-container div:nth-child(3) div.pdp-action-container.pdp-fixed > div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
		
		System.out.println("Option is available");
		
	}

}
