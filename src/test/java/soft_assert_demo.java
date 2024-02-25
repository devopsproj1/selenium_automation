import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert_demo {
    @Test
    public void url_pass_Verification() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        String E_title = driver.getTitle();
        String A_tile = "YourStore";
        SoftAssert Sassert = new SoftAssert();
        Sassert.assertEquals(A_tile, E_title);
        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("HP", Keys.ENTER);
        driver.quit();
        Sassert.assertAll();

    }

    @Test
    public void comments() {
        System.out.println("second test");
    }
}
