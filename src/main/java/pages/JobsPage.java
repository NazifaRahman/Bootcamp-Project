package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsPage {
    @FindBy(id = "advanced_search_searchTerm") private List<WebElement> input;
    @FindBy(xpath = "//button[@type='button' and @class = 'ant-btn ant-btn-primary ant-input-search-button']") private WebElement searchButton;
    @FindBy(id = "tabPayGrade") private WebElement clickPayGrade;

    public JobsPage searchJobTitle (String inputText) {
        input.get(0).sendKeys(inputText);
        searchButton.click();
        return this;
    }

    public JobsPage payGrades(){
        clickPayGrade.click();
        return this;
    }

}
