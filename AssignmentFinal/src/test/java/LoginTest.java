package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://example.com");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.enterUsername("yourUsername");
        loginPage.enterPassword("yourPassword");
        loginPage.clickLoginButton();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
