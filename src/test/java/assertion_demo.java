import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion_demo {

    @Test
    public void url_pass_Verification() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        String E_title = driver.getTitle();
        String A_tile = "Your Store";
        Assert.assertEquals(A_tile, E_title);
        driver.close();

    }

    @Test
    public void url_failed_Verification() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        String E_title = driver.getTitle();
        String A_tile = "Your_Store";
        Assert.assertNotEquals(A_tile, E_title);
        driver.close();

    }

    @Test
    public void url_chsr_Verification() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        String E_title = driver.getTitle();

        Assert.assertTrue(E_title.contains("Store"));
        driver.close();
    }

    @Test
    public void url_fail_Verification() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        if (driver.getTitle().contains("Your")) {
            Assert.fail("Title is Your hence failed");
        }

    }
}
