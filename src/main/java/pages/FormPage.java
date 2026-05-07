package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }
    By username = By.name("username");
    By password = By.name("password");
    By submitButton = By.cssSelector("input[type='submit']");
    public void openFormPage() {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
    }
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickSubmit() {
        WebElement submit = driver.findElement(submitButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submit);
        js.executeScript("arguments[0].click();", submit);
    }
    public String getPageSource() {
        return driver.getPageSource();
    }
}