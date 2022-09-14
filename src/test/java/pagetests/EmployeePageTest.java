package pagetests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testbase.TestBase;
import testlistener.TestListener;
import util.Util;

@Listeners(value = TestListener.class)

public class EmployeePageTest extends TestBase {

    @Test
    public void employeePageTest(){
        startLoginPage()
                .loginToAdminPage()
                .navigateToEmployeePage()
                .printAllEmployeeName()
                .validateFirstandLastName("John", "Doe")
                .searchEmployeeId("EMP003")
                .workHistory()
                .navigateToAdminPage();
    }

}
