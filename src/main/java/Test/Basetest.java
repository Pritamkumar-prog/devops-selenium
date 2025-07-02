package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Basetest {
    protected WebDriver driver; // ✅ This makes it accessible in subclasses

    @BeforeMethod
    public void setUp() {
        // ✅ REMOVE this line if chromedriver is in PATH
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
