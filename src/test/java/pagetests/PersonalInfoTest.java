package pagetests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PersonalInformation;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class PersonalInfoTest extends TestBase {

    @Test
    public void personalInfoTest() {
        startLoginPage()
                .loginToAdminPage()
                .navigateToPersonalInfo()
                .validatePageTitle("ICE Hrm")
                .editWorkInfo("Part Time Internship", "Head Office", "QA Engineer", "Manager");
    }
}
