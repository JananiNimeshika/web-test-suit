package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoggingPage {
private final WebDriver driver;
    public LoggingPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Navigate to web page")
    public void navigateToPage()
    {
        driver.get("https://www.saucedemo.com/");
    }

    @Step("Click on the logging Button ")
    public void clickLoggingButton()
    {
        driver.findElement(By.id("login-button")).click();
    }

    @Step("Enter username ")
    public void setUserName(String username)
    {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @Step("Enter password")
    public void setPassword(String password)
    {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Step("Check the logging is successful ")
    public boolean isLoginSuccessful()
    {
        return driver.getCurrentUrl().contains("inventory.html");
    }

    @Step("Check that error message is displayed")
    public boolean isErrorMessageDisplayed()
    {
        return driver.findElement(By.className("error-button")).isDisplayed();

    }





}

