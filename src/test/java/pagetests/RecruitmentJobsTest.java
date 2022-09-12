package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;

@Listeners(value = TestListener.class)

public class RecruitmentJobsTest extends TestBase {

    @Test
    public void recruitmentJobTest(){
        startLoginPage()
                .loginToAdminPage()
                .dropDownRecruitment()
                .searchJobCode("JC002")
                .validateJobTitle("QA Senior Test Automation Engineer")
                .validateDepartment("Marketing Department")
                .copyJobLink();
    }
}
