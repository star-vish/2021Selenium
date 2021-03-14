import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
public class Assertion {
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@Test
void Logotest() {
	WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));
	Assert.assertTrue(logo.isDisplayed());
}
@Test
void Title() {
	String title=driver.getTitle();
	Assert.assertEquals("OrangeHRM12",title);
}


}
