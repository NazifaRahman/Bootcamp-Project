package util;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class Util extends TestListenerAdapter {
    public static final int PAGE_LOAD_TIMEOUT = 20;
    public static final int IMPLICIT_WAIT = 10;

}
