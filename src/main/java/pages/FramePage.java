package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    By heading = By.tagName("h1");

    public void openFramePage() {

        driver.get(
                "https://testpages.eviltester.com/styled/frames/frames-test.html"
        );
    }

    public void switchToFrame() {

        driver.switchTo().frame("left");
    }

    public String getFrameText() {

        return driver.findElement(heading).getText();
    }

    public void switchToDefaultContent() {

        driver.switchTo().defaultContent();
    }
}