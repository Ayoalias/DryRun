package co.uk.dryrun.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class browserManager extends driverManager {

    private WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initFirefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initInternetExplorer() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }

    private WebDriver initChromeHeadless() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");

        return new ChromeDriver(options);
    }

    private WebDriver initFirefoxHeadless() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu", "--headless");

        return new FirefoxDriver(options);
    }

    /*#############################################################
        Uses - This method launches any browser assigned to it
        It takes Chrome, Firefox and IE and initialises the driver
        ###############################################################*/
    public void launchBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                driver = initChromeDriver();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "ChromeHeadless":
                driver = initChromeHeadless();
                break;
            case "FirefoxHeadless":
                driver = initFirefoxHeadless();
                break;
            case "ie":
            case "internetexplorer":
                driver = initInternetExplorer();
                break;
            default:
                System.out.println(browser + " is not recognised, so Chrome browser is launched");
                driver = initChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}