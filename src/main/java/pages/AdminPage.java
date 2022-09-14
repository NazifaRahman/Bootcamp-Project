package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.desktop.AppForegroundListener;
import java.util.List;

public class AdminPage extends Browser{

    @FindBy(id = "employeeLink") private WebElement manageEmployees;
    @FindBy(linkText = "Job Details Setup") private WebElement jobDetails;
    @FindBy(linkText = "IceHrm Employee") private WebElement myDetails;
    @FindBy(id = "settingsLink") private WebElement gotoSetting;
    @FindBy(css = "a[href='#']>i[class = 'fa fa-th']") WebElement selectRecruitment;
    @FindBy(css = ".fa.fa-columns") private List<WebElement> selectJobPositions;
    @FindBy(id = "candidatesLink") private WebElement Applicants;

    public EmployeePage navigateToEmployeePage() {
        manageEmployees.click();
        return PageFactory.initElements(driver, EmployeePage.class);
    }

    public JobsPage navigateToJobDetails(){
        jobDetails.click();
        return PageFactory.initElements(driver, JobsPage.class);
    }

    public PersonalInformation navigateToPersonalInfo(){
        myDetails.click();
        return PageFactory.initElements(driver, PersonalInformation.class);
    }

    public SettingPage gotoSettingPage() {
        gotoSetting.click();
        return PageFactory.initElements(driver, SettingPage.class);
    }

    public RecruitmentJobs dropDownRecruitment(){
        selectRecruitment.click();
        selectJobPositions.get(1).click();
        return PageFactory.initElements(driver, RecruitmentJobs.class);
    }

    public ApplicantsPage GotoApplicantPage(){
        Applicants.click();
        return PageFactory.initElements(driver, ApplicantsPage.class);
    }

}
