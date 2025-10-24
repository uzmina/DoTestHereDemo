package doTestHereTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver(); // assign to class-level driver
        driver.manage().window().maximize();
        driver.get("http://dotesthere.com"); // corrected URL
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
}
