package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static browser.Browser.driver;

public class RecruitmentJobs extends Browser {
    @FindBy(id = "advanced_search_searchTerm") private WebElement searchBox;
    @FindBy(css = ".ant-btn.ant-btn-primary.ant-input-search-button") private WebElement searchButton;
    @FindBy(xpath = "//span[@class = 'ant-tag ant-tag-orange']") private WebElement clickJobLink;
    @FindBy(id = "linkUrl") private WebElement clickJobURL;
    @FindBy(xpath = "//button[@class = 'btn']") List<WebElement> okButton;
    @FindBy(xpath = "//tr[@class = 'ant-table-row ant-table-row-level-0 table-row-light']/td[2]") private WebElement jobTitleElement;
    @FindBy(xpath = "//tr[@class = 'ant-table-row ant-table-row-level-0 table-row-light']/td[4]") private WebElement dept;

    public RecruitmentJobs searchJobCode(String jobCode) {
        searchBox.sendKeys(jobCode);
        searchButton.click();
        return this;
    }

    public RecruitmentJobs validateJobTitle(String jobTitle) {
        Assert.assertEquals(jobTitleElement.getText(), jobTitle);
        return this;
    }

    public RecruitmentJobs validateDepartment(String department) {
        Assert.assertEquals(dept.getText(), department);
        return this;
    }

    public RecruitmentJobs clickJobLink(){
        clickJobLink.click();
        clickJobURL.click();
        okButton.get(1).click();
        return this;
    }

}
