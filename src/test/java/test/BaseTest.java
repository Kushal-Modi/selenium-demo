package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseTest {
	
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		//open chrome browser and open fb url
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterTest
	public void teardown() {
		//quit the chrome browser
		driver .quit();
	}
	
}
