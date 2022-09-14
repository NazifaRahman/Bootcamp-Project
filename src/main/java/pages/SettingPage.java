package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SettingPage extends Browser {
    @FindBy(css = "img[class = 'tableActionButton']") private List<WebElement> edit;
    @FindBy(css = "button[onclick = 'try{modJs.save()}catch(e){};return false;']") private WebElement save;


    public SettingPage editing() {
        edit.get(0).click();
        Select select = new Select(driver.findElements(By.xpath("//b[@role= 'presentation']")).get(1));
        select.selectByVisibleText("United States");
        save.click();
        return this;
    }
}