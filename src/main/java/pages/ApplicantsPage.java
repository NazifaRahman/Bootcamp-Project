package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplicantsPage extends Browser {
    @FindBy(xpath = "//button[@class = 'btn btn-small btn-primary']") private List<WebElement> AddNew;
    @FindBy(id = "first_name") private WebElement FirstName;
    @FindBy(id = "last_name") private WebElement LastName;
    @FindBy(xpath = "//button[@class='saveBtn btn btn-primary pull-right']") private List<WebElement> save;
    @FindBy(id = "gender") private WebElement genderchoice;
    @FindBy(xpath = "//option[@value='Male']") private WebElement male;
    @FindBy(id = "city")private WebElement city;
    @FindBy(id = "home_phone")private WebElement phonehome;
    @FindBy(id = "email")private WebElement personalemail;

    public ApplicantsPage addNewCandidate(){
        AddNew.get(0).click();
        FirstName.sendKeys("Bugs");
        LastName.sendKeys("Bunny");
        genderchoice.click();
        male.click();
        city.sendKeys("Acme Studios");
        phonehome.sendKeys("1-800-MEE-ACME");
        personalemail.sendKeys("ACEMSTUDIOS@nunyabusiness.com");
        save.get(0).click();

        return this;
    }

}
