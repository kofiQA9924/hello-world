package testCaseOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testOne{
	WebDriver driver;
	@BeforeClass
    public void setUp() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com./");	
	}

@Test
public void testTitle(){
    String actualTitle=driver.getTitle();
    Assert.assertEquals(actualTitle,"Google");
}
@Test
public void testURL(){
    String actualURL=driver.getCurrentUrl();
    Assert.assertEquals(actualURL,"https://www.google.com/");
}
@AfterClass
public void terminate(){

}
}
