package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Browser {

    @FindBy(id = "username") private WebElement userName;
    @FindBy(id = "password") private WebElement password;
    @FindBy(xpath = "//button[@onclick = 'submitLogin();return false;']") private WebElement loginButton;

    public AdminPage loginToAdminPage() {
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        loginButton.click();

        return PageFactory.initElements(Browser.driver, AdminPage.class);
    }

}
