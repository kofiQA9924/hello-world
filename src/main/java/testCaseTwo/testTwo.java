package testCaseTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testTwo {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.programiz.com");
    }

    @Test
    public void testTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Programiz: Learn to Code for Free");
    }

    @Test
    public void testURL() {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, "https://www.programiz.com/");
    }

    @AfterClass
    public void terminate() {
    }

}
