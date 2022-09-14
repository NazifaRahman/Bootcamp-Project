package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class SettingPageTest extends TestBase {

    @Test
    public void settingPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .gotoSettingPage()
                .editing();
    }

}
