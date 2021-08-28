package co.uk.dryrun.pages;

import co.uk.dryrun.commons.driverManager;
import co.uk.dryrun.commons.driverManager;
import io.cucumber.core.runtime.BackendServiceLoader;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

public class basePage extends driverManager {


    public String Base_Url = "https://nl.tommy.com/";

    public void UserNavigatestoTHLandingPage() {

        driver.navigate().to(Base_Url);
    }

    /*#######################################################
    To Generate multiple Emails
    */
//    public String emailGenerator() {
//        String email = "";
//        String dateNow = new SimpleDateFormat("ddMMyymmss")
//                .format(new GregorianCalendar().getTime());
//        email = "automation" + dateNow + "@yahoo.com";
//        System.out.println(email);
//
//        return email;
//    }

    public static File takeScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }

    public static void saveScreenshot() throws Exception {
        String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
        String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
        String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);
        File screenshot = takeScreenShot();
        FileUtils.copyFile(screenshot, new File(fileName));
    }

    /*#######################################################
    To Generate multiple Emails
    */
    public String dynamicEmailGenerator() {
        String email = "";
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email = ("username" + randomInt + "@gmail.com");
        System.out.println(email);

        return email;
    }

    public String passwordGenerator() {
        String password = "";
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        password = ("Lolly" + randomInt);
        System.out.println(password);

        return password;
    }

//    EMailAddress.sendKeys("Automation_" +Number.Next(1, 1000).ToString() + "_" + driver.RandomString(4) + "@gmail.com");

}
