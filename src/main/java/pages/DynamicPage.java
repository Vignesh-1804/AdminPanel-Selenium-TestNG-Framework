package pages;

import base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPage extends BasePage {

    public DynamicPage(WebDriver driver) {

        super(driver);
    }

    By button =
            By.id("button00");

    public void openDynamicPage() {

        driver.get(
                "https://testpages.eviltester.com/styled/dynamic-buttons-simple.html"
        );
    }

    public void clickDynamicButton() {

        driver.findElement(button).click();
    }

    public boolean isButtonDisplayed() {

        return driver.findElement(button)
                .isDisplayed();
    }
}