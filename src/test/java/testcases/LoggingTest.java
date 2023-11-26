package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.LoggingPage;



public class LoggingTest {
    private WebDriver driver;
    private LoggingPage loginPage;

    @BeforeTest
    public void setUp()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginPage = new LoggingPage(driver);
    }

    @AfterTest
    public void tearDown()
    {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    @Description("Verify the successfully login")
    public void testSuccessfulLogin()
    {
        loginPage.navigateToPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoggingButton();
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @Test
    @Description("Verify the invalid login")
    public void testInvalidLogin()
    {
        loginPage.navigateToPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("invalid_password");
        loginPage.clickLoggingButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }
}
