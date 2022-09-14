package testlistener;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class TestListener extends TestListenerAdapter {
    public void onTestFailure(ITestResult testResult) {
        WebDriver driver = Browser.driver;
        final String path = "src/main/java/screenshots/";
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(path + testResult.getName() + ".png"); //destination of where the screenshot will go

        try {
            FileUtils.copyFile(screenshot, destinationFile); //copying the file screenshot to the destination file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
