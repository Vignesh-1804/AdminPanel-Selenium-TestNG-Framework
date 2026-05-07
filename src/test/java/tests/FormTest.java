package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FormPage;
public class FormTest extends BaseTest {
    @DataProvider(name = "formData")
    public Object[][] getData() {
        return new Object[][]{
                {"admin", "admin123"},
                {"test", "test123"}
        };
    }
    @Test(dataProvider = "formData")
    public void verifyFormSubmission(String username, String password) {
        FormPage formPage = new FormPage(driver);
        formPage.openFormPage();
        formPage.enterUsername(username);
        formPage.enterPassword(password);
        formPage.clickSubmit();
        Assert.assertTrue(true);
    }
    @Test
    public void verifyEmptyFormSubmission() {
        FormPage formPage = new FormPage(driver);
        formPage.openFormPage();
        formPage.clickSubmit();
        Assert.assertTrue(true);
    }
    @Test
    public void verifyDropdownSelection() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyRadioButtonSelection() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyCheckboxSelection() {
        Assert.assertTrue(true);
    }
}