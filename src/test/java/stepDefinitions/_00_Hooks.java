package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _00_Hooks {

    @Before
    public void before(Scenario scenario){
        System.out.println(scenario.getName() + " has been started.");

    }


    @After
    public void after(Scenario scenario){

        System.out.println(scenario.getName() + " : " + scenario.getStatus());

        Date now = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH mm ss");
        String strDate = formater.format(now);

        if (scenario.getStatus() == "failed"){

            String scenarioName = scenario.getName();
            strDate = strDate.replace(":","");

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File screenshot = ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(screenshot, new File("target/failedScreenShots/"
                        + Driver.threadBrowserName.get()+ "_" + scenarioName+ "_" + strDate + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.quitDriver();
    }
}