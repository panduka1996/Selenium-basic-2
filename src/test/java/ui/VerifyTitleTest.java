package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {

	@Test
	public void titleTest() {
		
		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String titleSite = driver.getTitle();
		
		Assert.assertEquals(titleSite, title);
		
	}
}
