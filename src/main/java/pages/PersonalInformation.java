package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class PersonalInformation extends Browser {
    @FindBy(css = "span[class = 'ant-tag ant-tag-processing']") private List<WebElement> edit;
    @FindBy(css = "button[class = 'ant-btn ant-btn-primary']") private List<WebElement> NextandSaveButton;
    @FindBy(xpath = "//div[@class = 'ant-select-item ant-select-item-option']") private List<WebElement> options;
    @FindBy(css = "span[class = 'ant-select-selection-item']") private List<WebElement> selectArrow;

    public PersonalInformation validatePageTitle(String pageTitle) {
        Assert.assertEquals(driver.getTitle(), pageTitle);
        return this;
    }

    public PersonalInformation editWorkInfo(String employmentStatus, String department, String jobTitle, String payGrade){
        edit.get(0).click();
        NextandSaveButton.get(0).click();
        NextandSaveButton.get(0).click();

        selectArrow.get(3).click();

        for(WebElement element: options) {
            if (element.getText().equalsIgnoreCase(employmentStatus)) {
                element.click();
                break;
            }
        }

        selectArrow.get(4).click();

        for (WebElement element1 : options) {
            if (element1.getText().equalsIgnoreCase(department)) {
                element1.click();
                break;
            }
        }

        selectArrow.get(5).click();

        for (WebElement element2 : options) {
            if (element2.getText().equalsIgnoreCase(jobTitle)) {
                element2.click();
                break;
            }
        }

        selectArrow.get(6).click();

        for (WebElement element3 : options) {
            if (element3.getText().equalsIgnoreCase(payGrade)) {
                element3.click();
                break;
            }
        }

        NextandSaveButton.get(1).click();
        return this;
    }

}
