package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablePage extends BasePage {

    public TablePage(WebDriver driver) {
        super(driver);
    }

    By firstHeader = By.cssSelector("th");
    By firstRow = By.cssSelector("tbody tr td");

    public void openSortableTable() {

        driver.get(
                "https://testpages.eviltester.com/styled/tag/table.html"
        );
    }

    public String getFirstRowData() {

        return driver.findElement(firstRow).getText();
    }

    public void clickHeader() {

        driver.findElement(firstHeader).click();
    }

    public void openPagedTable() {

        driver.get(
                "https://testpages.eviltester.com/styled/tag/table.html"
        );
    }
}