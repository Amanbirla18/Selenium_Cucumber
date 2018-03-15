package Runner;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
import com.sun.jna.platform.FileUtils;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"}, glue ={"Steps"}, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Selenium_Workspace\\Cucumber_Selenium\\Reports\\Reports.html"})
	public class Testrunner {
public static void teardown()  {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("windows", "Windows 7");
        Reporter.setTestRunnerOutput("Sample test runner output message");
        
	}
	
	

} 