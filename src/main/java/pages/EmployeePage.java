package pages;

import browser.Browser;
import org.checkerframework.checker.units.qual.A;
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

    public EmployeePage printAllEmployeeName () {
        List<WebElement> allRows = driver.findElements(By.cssSelector(".ant-table-row.ant-table-row-level-0"));
        for (WebElement row: allRows) {
            WebElement fName =row.findElement(By.xpath("td[3]"));
            WebElement lName = row.findElement(By.xpath("td[4]"));
            String frstName = fName.getText();
            String lstName = lName.getText();
            System.out.println("First name: " + frstName + "    Last name: " + lstName);
        }

        return this;
    }

    public EmployeePage validateFirstandLastName (String firstName, String lastName) {
        List<WebElement> allRows = driver.findElements(By.cssSelector(".ant-table-row.ant-table-row-level-0"));
        WebElement element = allRows.get(2);
        WebElement fName =element.findElement(By.xpath("td[3]"));
        WebElement lName = element.findElement(By.xpath("td[4]"));
        String frstName = fName.getText();
        String lstName = lName.getText();
        Assert.assertEquals(frstName, firstName);
        Assert.assertEquals(lstName, lastName);

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
