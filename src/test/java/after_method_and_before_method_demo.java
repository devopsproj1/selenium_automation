import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class after_method_and_before_method_demo {
    WebDriver driver;

    @AfterMethod
    public void teardown_browser() {
        driver.quit();
    }

    @BeforeMethod
    public void open_uri() {

        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/"); //wrong url

    }

    @Test
    public void open_url() {

        System.out.println("first test");

    }

    @Test
    public void verify_url() {
        System.out.println("second test");

    }

}
