package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class LoginPageTest extends TestBase {

    @Test
    public void loginToEmployeePageTest() {
        startLoginPage()
                .loginToAdminPage()
                .navigateToEmployeePage();


    }
    @Test
    public void loginToJobPageTest() {
        startLoginPage()
                .loginToAdminPage()
                .navigateToJobDetails();
    }


}
