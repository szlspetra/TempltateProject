package main;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class main {
	
	String strCurrDir = System.getProperty("user.dir");
	@Test
	public void buildingTestMethod() {
	
	System.out.println(strCurrDir);
	System.setProperty("webdriver.chrome.driver", strCurrDir+"\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.browserstack.com/");
	
	String verifyBrowserStackTitle = driver.getTitle();
	
	assertEquals("Most Reliable App & Cross Browser Testing Platform | BrowserStack",verifyBrowserStackTitle);
	
	}
	

}