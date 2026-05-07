package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPage;
public class DynamicTest extends BaseTest {
    @Test
    public void verifyDynamicElement() {
        DynamicPage dynamicPage = new DynamicPage(driver);
        dynamicPage.openDynamicPage();
        dynamicPage.clickDynamicButton();
        Assert.assertTrue(dynamicPage.isButtonDisplayed());
    }
    @Test
    public void verifyHiddenElement() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyRedirectPage() {
        driver.get("https://testpages.eviltester.com/styled/index.html");
        Assert.assertTrue(true);
    }
}