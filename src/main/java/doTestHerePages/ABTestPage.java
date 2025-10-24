package doTestHerePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestPage extends BasePage {
    public ABTestPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"ab-test-content\"]/button")
    private WebElement ABTestButton;

    @FindBy(tagName = "h3")
    private WebElement tagNameAB;

    @FindBy(id = "ab-heading")
    private WebElement abHeading;

    @FindBy(className = "hint-btn")
    private WebElement selectCodeInfo;

    @FindBy(xpath = "//*[@id=\"code-ab-testing\"]/div[1]")
    private WebElement codeInfo;

    public void launchApp() {
        driver.get("https://dotesthere.com/#ab-testing");
    }

    public void clickABSwitch() {
        ABTestButton.click();
    }

    public String getABText() {
        return tagNameAB.getText();
    }

    public String getABHeading() {
        return abHeading.getText();
    }

    public void clickSelectCodeInfo() {
        selectCodeInfo.click();
    }

    public boolean isCodeInfoDisplayed() {
        return codeInfo.isDisplayed();
    }

}
