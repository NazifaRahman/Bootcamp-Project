package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class ApplicantsPageTest extends TestBase {

    @Test
    public void applicantsPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .GotoApplicantPage()
                .addNewCandidate();
    }

}
