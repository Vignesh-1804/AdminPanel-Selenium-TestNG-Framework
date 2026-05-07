package pages;
import base.BasePage;
import org.openqa.selenium.*;
public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    By alertButton = By.id("alertexamples");
    By promptButton = By.id("promptexample");
    public void openAlertPage() {
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
    }
    public void clickAlertButton() {
        driver.findElement(alertButton).click();
    }
    public void clickPromptButton() {
        WebElement prompt = driver.findElement(promptButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", prompt);
        js.executeScript("arguments[0].click();", prompt);
    }
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void enterPromptText(String text) {
        clickPromptButton();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }
}