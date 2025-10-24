package doTestHereTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ABTestOptOut {
    WebDriver driver = new ChromeDriver();


    @BeforeMethod()
    public void beforeMethod() {
        driver.get("https://dotesthere.com/");
    }

    @AfterMethod()
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void abTestOptOut() {

    }

}
