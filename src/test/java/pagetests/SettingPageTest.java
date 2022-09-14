package pagetests;

import org.testng.annotations.Test;
import testbase.TestBase;

public class SettingPageTest extends TestBase {

    @Test
    public void settingPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .gotoSettingPage()
                .editing();
    }
}
