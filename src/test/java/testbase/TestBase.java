package testbase;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class TestBase extends Browser {
    @BeforeMethod
    public void setUp() {
        driver = Browser.initializeBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(Info.URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    public LoginPage startLoginPage() {
        return PageFactory.initElements(driver, LoginPage.class);
    }

}
