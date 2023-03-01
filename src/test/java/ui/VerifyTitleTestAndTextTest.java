package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTestAndTextTest {

	@Test
	public void verifyTitle() {
		
		SoftAssert sortAssert = new SoftAssert();
		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String text = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String titleSite = driver.getTitle();
		System.out.println("Title Verification");
		sortAssert.assertEquals(titleSite, title,"Title verification failed");
		String textSite = driver.findElement(By.cssSelector("input[id='gh-btn']")).getAttribute("value");
		System.out.println("Text Verification");
		sortAssert.assertEquals(textSite, text, "Text verification failed");
		System.out.println("Close Browser");
		driver.close();
		sortAssert.assertAll();

	}
}
