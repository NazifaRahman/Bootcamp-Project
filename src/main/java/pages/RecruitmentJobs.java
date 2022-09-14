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
    @FindBy(id = "linkUrl") private WebElement jobURL;
    @FindBy(xpath = "//button[@class = 'btn']") List<WebElement> okButton;

    public RecruitmentJobs searchJobCode(String jobCode) {
        searchBox.sendKeys(jobCode);
        searchButton.click();
        return this;
    }

    public RecruitmentJobs validateJobTitle(String jobTitle) {
        WebElement jobTitleElement = driver.findElement(By.xpath("//tr[@class = 'ant-table-row ant-table-row-level-0 table-row-light']/td[2]"));
        Assert.assertEquals(jobTitleElement.getText(), jobTitle);
        return this;
    }

    public RecruitmentJobs validateDepartment(String department) {
        WebElement dept = driver.findElement(By.xpath("//tr[@class = 'ant-table-row ant-table-row-level-0 table-row-light']/td[4]"));
        Assert.assertEquals(dept.getText(), department);
        return this;
    }

    public RecruitmentJobs copyJobLink(){
        clickJobLink.click();
        jobURL.click();
        okButton.get(1).click();
        return this;
    }

}
