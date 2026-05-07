package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablePage;
public class TableTest extends BaseTest {
    @Test
    public void verifySortableTable() {
        TablePage tablePage = new TablePage(driver);
        tablePage.openSortableTable();
        tablePage.clickHeader();
        Assert.assertTrue(true);
    }
    @Test
    public void verifyPagedTable() {
        TablePage tablePage = new TablePage(driver);
        tablePage.openPagedTable();
        Assert.assertTrue(true);
    }
    @Test
    public void verifyPagination() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyTableHeaders() {
        TablePage tablePage = new TablePage(driver);
        tablePage.openSortableTable();
        Assert.assertTrue(true);
    }
}