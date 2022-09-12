package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class JobsPageTest extends TestBase {

    @Test
    public void jobsPageTest(){
        startLoginPage()
                .loginToAdminPage()
                .navigateToJobDetails()
                .searchJobTitle("QA")
                .payGrades();
    }

}
