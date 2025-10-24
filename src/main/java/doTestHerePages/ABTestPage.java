package doTestHerePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ABTestPage extends BasePage{

    public ABTestPage(WebDriver driver) {
        super(driver);
    }

    WebElement ABTestLink = driver.findElement(By.linkText("https://dotesthere.com/#ab-testing"));

}
