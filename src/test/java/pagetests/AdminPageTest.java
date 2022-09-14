package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class AdminPageTest extends TestBase {
    @Test
    public void navigateToEmployeePageTest(){
        startLoginPage()
                .loginToAdminPage()
                .navigateToEmployeePage();
    }

    @Test
    public void navigateToJobDetailsTest(){
        startLoginPage()
                .loginToAdminPage()
                .navigateToJobDetails();
    }

    @Test
    public void navigateToPersonalInfoTest(){
        startLoginPage()
                .loginToAdminPage()
                .navigateToPersonalInfo();
    }

    @Test
    public void navigateToRecruitmentTest(){
        startLoginPage()
                .loginToAdminPage()
                .dropDownRecruitment();
    }

    @Test
    public void navigatetoSettingPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .gotoSettingPage();
    }

    @Test
    public void navigateToApplicantPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .gotoApplicantPage();
    }

}
