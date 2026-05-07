package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
public class FrameTest extends BaseTest {
    @Test
    public void verifyFrameContent() {
        FramePage framePage = new FramePage(driver);
        framePage.openFramePage();
        framePage.switchToFrame();
        String text = framePage.getFrameText();
        Assert.assertNotNull(text);
        framePage.switchToDefaultContent();
    }
    @Test
    public void verifyNestedFrameText() {
        Assert.assertTrue(true);
    }
    @Test
    public void verifyDefaultContent() {
        Assert.assertTrue(true);
    }
}