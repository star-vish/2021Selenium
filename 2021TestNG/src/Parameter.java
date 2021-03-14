import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser, String app) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
			driver=new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			{
				System.setProperty("webdriver.firefox.driver","/usr/local/bin/geckodriver");
				driver=new FirefoxDriver();
			}
			driver.get(app);

		}
	}
		@Test
		void Logotest() {
			WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));
			Assert.assertTrue(logo.isDisplayed());
		}
	}


