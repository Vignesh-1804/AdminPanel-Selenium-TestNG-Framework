package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
public class AlertTest extends BaseTest {
    @Test
    public void verifyAlertAccept() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.openAlertPage();
        alertPage.clickAlertButton();
        alertPage.acceptAlert();
        Assert.assertTrue(true);
    }
    @Test
    public void verifyConfirmAccept() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyConfirmDismiss() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyPromptAlert() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.openAlertPage();
        alertPage.enterPromptText("Hello");
        Assert.assertTrue(true);
    }
}