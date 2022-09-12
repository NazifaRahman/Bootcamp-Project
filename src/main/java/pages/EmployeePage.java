package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class EmployeePage extends Browser{
    @FindBy(id = "advanced_search_searchTerm") private WebElement inputSearchText;
    @FindBy(xpath = "//button[@type='button' and @class = 'ant-btn ant-btn-primary ant-input-search-button']") private WebElement searchButton;
    @FindBy(id = "tabEmployeeCareer") private WebElement clickWorkHistory;
    @FindBy(linkText = "Home") private WebElement adminLink;

    public EmployeePage validateFirstAndLastName (String firstName, String lastName) {
        List<WebElement> allRows = driver.findElements(By.xpath("//td[@class = 'ant-table-cell']"));
        for (WebElement row: allRows) {
            if(allRows.contains(firstName)){
                String value = row.getText();
               // WebElement cName =driver.findElement(By.xpath("//td[3]"));
               // String value = cName.getText();
                System.out.println("###### " + value);
            }
        }
        return this;
    }

    public EmployeePage searchEmployeeId (String employeeNumber) {
        inputSearchText.sendKeys(employeeNumber);
        searchButton.click();
        return this;
    }

    public EmployeePage workHistory(){
        clickWorkHistory.click();
        return this;
    }
    public AdminPage navigateToAdminPage() {
        adminLink.click();
        return PageFactory.initElements(Browser.driver, AdminPage.class);
    }

}
