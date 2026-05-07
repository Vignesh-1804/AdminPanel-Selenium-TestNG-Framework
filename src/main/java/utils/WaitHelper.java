package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class WaitHelper {
    WebDriverWait wait;
    public WaitHelper(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}