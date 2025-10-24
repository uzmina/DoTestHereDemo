package doTestHereTests;

import doTestHerePages.ABTestPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABScenarioTest extends BaseTests {
    private ABTestPage abTestPagePage;

    @Test
    public void testABTestOption() {
        abTestPagePage = new ABTestPage(driver);
        abTestPagePage.launchApp();

        String heading3Text = abTestPagePage.getABText();
        Assert.assertTrue(heading3Text.contains("A/B Testing"),
                "Expected heading to start with'A/B Test' but found: " + heading3Text);
        String heading4Text = abTestPagePage.getABHeading();
        Assert.assertTrue(heading4Text.contains("Version A: Original Content"),"Defaul heading test A contains 'Version A: Original Content' ");

        abTestPagePage.clickABSwitch();

        String heading4Text2 = abTestPagePage.getABHeading();
        Assert.assertEquals(heading4Text2, "Version B: Alternative Content",
                "Heading after cookie should be 'Version B: Alternative Content'");

        abTestPagePage.clickSelectCodeInfo();
        Assert.assertTrue(abTestPagePage.isCodeInfoDisplayed(),"Code info should be displayed");
    }
}
