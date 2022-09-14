package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;
import util.Util;

@Listeners(value = TestListener.class)

public class AdminPageTest extends TestBase {

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


}
